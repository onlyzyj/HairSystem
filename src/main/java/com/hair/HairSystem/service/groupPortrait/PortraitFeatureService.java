package com.hair.HairSystem.service.groupPortrait;

import com.hair.HairSystem.mapper.groupPortrait.PortraitFeatureMapper;
import com.hair.HairSystem.pojo.groupPortrait.PortraitFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortraitFeatureService {

    @Autowired
    private PortraitFeatureMapper portraitFeatureMapper;

    public List<PortraitFeature> getFeatures(Integer listId){
        return portraitFeatureMapper.getFeatures(listId);
    }

    public List<String> features(Integer listId){
        return portraitFeatureMapper.Features(listId);
    }

}
