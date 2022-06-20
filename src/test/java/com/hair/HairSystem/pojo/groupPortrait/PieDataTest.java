package com.hair.HairSystem.pojo.groupPortrait;

import com.alibaba.fastjson.JSONArray;
import com.hair.HairSystem.StartSpringBootApplication;
import com.hair.HairSystem.util.ChartUtil;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {StartSpringBootApplication.class})    //指定启动类
public class PieDataTest extends TestCase {

    @Test
    public void pieDataTest(){

        PieData pieData = new PieData();
        pieData.setType("运维状态");
        pieData.setSubType("电热水器");
        ArrayList<Integer> values = new ArrayList<>();
        values.add(234);
        values.add(456);
        values.add(567);
        ArrayList<String> tips = new ArrayList<>();
        tips.add("群体1");
        tips.add("群体2");
        tips.add("群体3");
        pieData.setTips(tips);
        pieData.setValues(values);
        Object obj = JSONArray.toJSON(pieData);
        String json = obj.toString();
        System.out.println(json);

    }

    @Test
    public void barDataTest(){
        BarData barData = ChartUtil.getBarData();
        String json = JSONArray.toJSON(barData).toString();
        System.out.println(json);
    }


}