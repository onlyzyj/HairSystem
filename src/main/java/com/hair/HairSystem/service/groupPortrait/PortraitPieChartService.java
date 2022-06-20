package com.hair.HairSystem.service.groupPortrait;

import com.hair.HairSystem.mapper.groupPortrait.PortraitPieChartMapper;
import com.hair.HairSystem.pojo.groupPortrait.PortraitPieChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortraitPieChartService {

    @Autowired
    private PortraitPieChartMapper portraitPieChartMapper;

    public List<PortraitPieChart> getPortraitList(Integer listId){
        List<PortraitPieChart> pieChartLists = portraitPieChartMapper.getPieChartLists(listId);
        return pieChartLists;
    }

}
