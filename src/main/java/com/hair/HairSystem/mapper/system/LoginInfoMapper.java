package com.hair.HairSystem.mapper.system;

import com.hair.HairSystem.pojo.system.LoginInfo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface LoginInfoMapper extends Mapper<LoginInfo> {

    @Select("SELECT * FROM logininfo WHERE username  = #{username}")
    LoginInfo loginQuery(String username);

}
