package com.hair.HairSystem.pojo.groupPortrait;

import java.util.ArrayList;
import java.util.List;

public class BarData {

    //群体特征
    private List<String> features;

    //各群体名称
    private ArrayList<String> tips;

    //各群体的特征值
    private ArrayList<double[]> values;

    @Override
    public String toString() {
        return "BarData{" +
                "features=" + features +
                ", tips=" + tips +
                ", values=" + values +
                '}';
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public ArrayList<String> getTips() {
        return tips;
    }

    public void setTips(ArrayList<String> tips) {
        this.tips = tips;
    }

    public ArrayList<double[]> getValues() {
        return values;
    }

    public void setValues(ArrayList<double[]> values) {
        this.values = values;
    }
}
