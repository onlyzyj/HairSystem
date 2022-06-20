package com.hair.HairSystem.mapper;

import com.hair.HairSystem.pojo.Role;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface RoleMapper extends Mapper<Role> {

    @Select("SELECT * FROM role WHERE sn  = #{snStr}")
    List<Role> queryByBrandId(String snStr);

}
