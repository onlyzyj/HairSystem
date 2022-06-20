package com.hair.HairSystem.service.groupPortrait;

import com.hair.HairSystem.StartSpringBootApplication;
import com.hair.HairSystem.mapper.groupPortrait.PortraitPieChartMapper;
import com.hair.HairSystem.pojo.groupPortrait.PortraitPieChart;
import com.hair.HairSystem.service.RoleService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {StartSpringBootApplication.class})    //指定启动类
public class PortraitPieChartServiceTest extends TestCase {

    @Autowired
    public PortraitPieChartService portraitPieChartService;

    @Autowired
    public PortraitListService portraitListService;

    @Autowired
    public PortraitPieChartMapper portraitPieChartMapper;

    @Autowired
    private PortraitBarChartService portraitBarChartService;

    @Autowired
    private PortraitFeatureService portraitFeatureService;

    @Autowired
    public RoleService roleService;

    @Test
    public void pieChartTest(){
        List<PortraitPieChart> portraitList = portraitPieChartService.getPortraitList(5);
        for (PortraitPieChart portraitPieChart : portraitList) {
            System.out.println(portraitPieChart);
        }
    }

    @Test
    public void show(){
        System.out.println(portraitListService.queryById(5));
        System.out.println(roleService.queryById(3l));
        System.out.println(portraitPieChartMapper.selectByPrimaryKey(1));
    }

    @Test
    public void showBar(){
        System.out.println(portraitFeatureService.getFeatures(8));
        System.out.println(portraitBarChartService.getBarCharts(1));
        System.out.println(portraitFeatureService.features(5));
    }




}