package com.hair.HairSystem.mapper.groupPortrait;

import com.hair.HairSystem.pojo.groupPortrait.PortraitPieChart;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PortraitPieChartMapper extends Mapper<PortraitPieChart> {

    @Select("SELECT * FROM portraitPieChart WHERE listid = #{listid}")
    public List<PortraitPieChart> getPieChartLists(int listid);

}
