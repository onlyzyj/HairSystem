package com.hair.HairSystem.pojo.groupPortrait;

import java.util.ArrayList;

//饼状图数据
public class PieData {

    //一级群体画像类型
    private String type;

    //二级群体画像类型
    private String subType;

    //各群体中个体的数量
    private ArrayList<Integer> values;

    //各群体名称
    private ArrayList<String> tips;

    @Override
    public String toString() {
        return "PieData{" +
                "type='" + type + '\'' +
                ", subType='" + subType + '\'' +
                ", values=" + values +
                ", tips=" + tips +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public ArrayList<Integer> getValues() {
        return values;
    }

    public void setValues(ArrayList<Integer> values) {
        this.values = values;
    }

    public ArrayList<String> getTips() {
        return tips;
    }

    public void setTips(ArrayList<String> tips) {
        this.tips = tips;
    }
}
