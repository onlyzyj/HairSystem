package com.hair.HairSystem.service.groupPortrait;

import com.hair.HairSystem.pojo.groupPortrait.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ChartDataService {

    @Autowired
    private PortraitBarChartService portraitBarChartService;

    //封装饼状图数据
    public PieData getPieData(PortraitList curPortrait, PortraitList parent, List<PortraitPieChart> portraitList) {
        PieData pieData = new PieData();
        pieData.setType(parent.getPortraitName());
        pieData.setSubType(curPortrait.getPortraitName());
        ArrayList<String> tips = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        for (PortraitPieChart portraitPieChart : portraitList) {
            tips.add(portraitPieChart.getGroupName());
            values.add(portraitPieChart.getGroupNum());
        }
        pieData.setTips(tips);
        pieData.setValues(values);
        return pieData;
    }

    //封装柱状图数据
    public BarData getBarData(List<String> features, List<PortraitPieChart> portraitList) {
        BarData barData = new BarData();
        barData.setFeatures(features);
        HashMap<String, Double> map = new HashMap<>();
        ArrayList<String> tips = new ArrayList<>();
        ArrayList<double[]> values = new ArrayList<double[]>();

        for (PortraitPieChart portraitPieChart : portraitList) {
            List<PortraitBarChart> barCharts = portraitBarChartService.getBarCharts(portraitPieChart.getId());
            for (PortraitBarChart barChart : barCharts) {
                map.put(barChart.getFeature(),barChart.getValue());
            }
            tips.add(portraitPieChart.getGroupName());

            double[] tmp = new double[map.size()];
            for (int i = 0; i < features.size(); i++) {
                tmp[i] = map.get(features.get(i));
            }
            values.add(tmp);
        }

        barData.setValues(values);
        barData.setTips(tips);
        return barData;
    }
}
