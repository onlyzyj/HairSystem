package com.hair.HairSystem.util;

import com.hair.HairSystem.pojo.groupPortrait.BarData;
import com.hair.HairSystem.pojo.groupPortrait.PieData;

import java.util.ArrayList;

public class ChartUtil {

    public static PieData getPieData(){
        PieData pieData = new PieData();
        pieData.setType("运维状态");
        pieData.setSubType("电热水器");
        ArrayList<Integer> values = new ArrayList<>();
        values.add(234);
        values.add(456);
        values.add(567);
        values.add(445);
        values.add(546);
        ArrayList<String> tips = new ArrayList<>();
        tips.add("群体1");
        tips.add("群体2");
        tips.add("群体3");
        tips.add("群体4");
        tips.add("群体5");
        pieData.setTips(tips);
        pieData.setValues(values);
        return pieData;
    }

    public static BarData getBarData(){
        BarData barData = new BarData();
        ArrayList<String> features = new ArrayList<>();
        features.add("待维修时间");
        features.add("工作时长");
        features.add("剩余使用时间");
        barData.setFeatures(features);

        ArrayList<String> tips = new ArrayList<>();
        tips.add("群体1");
        tips.add("群体2");
        tips.add("群体3");
        tips.add("群体4");
        barData.setTips(tips);

        ArrayList<double[]> doubles = new ArrayList<>();
        doubles.add(new double[]{1.812, -1.513, 0.923});
        doubles.add(new double[]{0.941, 0.253, 0.519});
        doubles.add(new double[]{-0.109, 0.731, -0.114});
        doubles.add(new double[]{-1.647, 1.427, -1.374});
        barData.setValues(doubles);

        return barData;
    }

}
