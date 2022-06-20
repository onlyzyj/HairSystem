package com.hair.HairSystem.service.system;

import com.hair.HairSystem.mapper.system.LoginInfoMapper;
import com.hair.HairSystem.pojo.system.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginInfoService {

    @Autowired
    private LoginInfoMapper loginInfoMapper;

    public LoginInfo loginQuery(String username){
        return loginInfoMapper.loginQuery(username);
    }

}
