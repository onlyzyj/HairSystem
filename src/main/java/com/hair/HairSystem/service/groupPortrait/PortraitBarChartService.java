package com.hair.HairSystem.service.groupPortrait;

import com.hair.HairSystem.mapper.groupPortrait.PortraitBarChartMapper;
import com.hair.HairSystem.pojo.groupPortrait.PortraitBarChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortraitBarChartService {

    @Autowired
    private PortraitBarChartMapper portraitBarChartMapper;

    public List<PortraitBarChart> getBarCharts(Integer pieId){
        return portraitBarChartMapper.getBarCharts(pieId);
    }

}
