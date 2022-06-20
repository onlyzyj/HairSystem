package com.hair.HairSystem.controller;

import com.alibaba.fastjson.JSONArray;
import com.hair.HairSystem.pojo.groupPortrait.BarData;
import com.hair.HairSystem.pojo.groupPortrait.PieData;
import com.hair.HairSystem.pojo.groupPortrait.PortraitList;
import com.hair.HairSystem.pojo.groupPortrait.PortraitPieChart;
import com.hair.HairSystem.service.groupPortrait.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GroupController {

    @Autowired
    private ChartDataService chartDataService;

    @Autowired
    private PortraitPieChartService portraitPieChartService;

    @Autowired
    private PortraitListService portraitListService;

    @Autowired
    private PortraitFeatureService portraitFeatureService;

    @Autowired
    private PortraitBarChartService portraitBarChartService;

    @RequestMapping("groupPortrait")
    public String groupPortrait(Model model){
        return "groupPortrait";
    }
    
    @RequestMapping("group")
    public String groupHtml(@RequestParam("id") int id, Model model){
        model.addAttribute("id",id);
        return "init/group";
    }


    //获取饼状图的绘画数据
    @RequestMapping("getPieData")
    @ResponseBody
    public String getPieData(@RequestParam("charid") int id){
        PortraitList curPortrait = portraitListService.queryById(id);
        PortraitList parent = portraitListService.getParent(curPortrait);
        List<PortraitPieChart> portraitList = portraitPieChartService.getPortraitList(id);

        PieData pieData = chartDataService.getPieData(curPortrait,parent,portraitList);
        Object obj = JSONArray.toJSON(pieData);
        String json = obj.toString();
        return json;
    }

    //获取柱状图的绘画数据
    @RequestMapping("getBarData")
    @ResponseBody
    public String getBarData(@RequestParam("charid") int id){
        List<String> features = portraitFeatureService.features(id);
        List<PortraitPieChart> portraitList = portraitPieChartService.getPortraitList(id);

        BarData BarData = chartDataService.getBarData(features,portraitList);
        String json = JSONArray.toJSON(BarData).toString();
        System.out.println(json);
        return json;
    }

}
