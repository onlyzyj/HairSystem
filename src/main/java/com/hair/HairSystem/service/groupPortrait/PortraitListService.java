package com.hair.HairSystem.service.groupPortrait;

import com.hair.HairSystem.mapper.groupPortrait.PortraitListMapper;
import com.hair.HairSystem.pojo.groupPortrait.PortraitList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortraitListService {

    @Autowired
    private PortraitListMapper portraitListMapper;

    public PortraitList getById(Integer id){
        return portraitListMapper.selectByPrimaryKey(id);
    }

    public PortraitList getParent(PortraitList son){
        return portraitListMapper.selectByPrimaryKey(son.getPid());
    }

    public PortraitList queryById(Integer id){
        return portraitListMapper.selectByPrimaryKey(id);
    }
}
