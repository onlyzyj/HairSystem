package com.hair.HairSystem.mapper.groupPortrait;

import com.hair.HairSystem.pojo.groupPortrait.PortraitBarChart;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PortraitBarChartMapper extends Mapper<PortraitBarChart> {

    @Select("SELECT * FROM portraitBarChart WHERE pieId = #{pieId}")
    List<PortraitBarChart> getBarCharts(Integer pieId);

}
