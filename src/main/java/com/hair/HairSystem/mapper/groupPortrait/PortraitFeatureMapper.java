package com.hair.HairSystem.mapper.groupPortrait;

import com.hair.HairSystem.pojo.groupPortrait.PortraitFeature;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PortraitFeatureMapper extends Mapper<PortraitFeature> {

    @Select("SELECT * FROM portraitFeature WHERE listId = #{listid}")
    List<PortraitFeature> getFeatures(Integer listId);

    @Select("SELECT feature FROM portraitFeature WHERE listId = #{listid}")
    List<String> Features(Integer listId);
}
