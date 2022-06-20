package com.hair.HairSystem.service;

import com.hair.HairSystem.mapper.RoleMapper;
import com.hair.HairSystem.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public Role queryById(Long id){
        return this.roleMapper.selectByPrimaryKey(id);
    }

    public List<Role> queryALl(){
        return this.roleMapper.selectAll();
    }

    public List<Role> queryBySn(String snStr){
        return this.roleMapper.queryByBrandId(snStr);
    }
}

