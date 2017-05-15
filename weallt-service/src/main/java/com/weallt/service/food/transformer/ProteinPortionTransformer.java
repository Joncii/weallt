package com.weallt.service.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.dal.food.domain.portion.ProteinPortionEntity;
import com.weallt.service.food.domain.portion.ProteinPortion;


@Component
public class ProteinPortionTransformer {

    @Autowired
    private ProteinTransformer proteinTransformer;

    @Autowired
    private WeightPortionTransformer weightPortionTransformer;

    public ProteinPortion transform(ProteinPortionEntity entity) {
        ProteinPortion proteinPortion = new ProteinPortion();
        proteinPortion.setProtein(proteinTransformer.transform(entity.getProtein()));
        proteinPortion.setWeightPortion(weightPortionTransformer.transform(entity.getWeightPortion()));
        return proteinPortion;
    }

    public ProteinPortionEntity transform(ProteinPortion proteinPortion) {
        ProteinPortionEntity entity = new ProteinPortionEntity();
        entity.setProtein(proteinTransformer.transform(proteinPortion.getProtein()));
        entity.setWeightPortion(weightPortionTransformer.transform(proteinPortion.getWeightPortion()));
        return entity;
    }

}
