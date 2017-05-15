package com.weallt.service.food.transformer;

import org.springframework.stereotype.Component;

import com.weallt.dal.food.domain.EnergyEntity;
import com.weallt.service.food.domain.nutrient.EnergyPortion;

@Component
public class EnergyPortionTransformer {

    public EnergyPortion transform(EnergyEntity entity) {
        EnergyPortion energy = new EnergyPortion();
        energy.setValue(entity.getValue());
        energy.setMetric(entity.getMetric());
        return energy;
    }

    public EnergyEntity transform(EnergyPortion energy) {
        EnergyEntity entity = new EnergyEntity();
        entity.setValue(energy.getValue());
        entity.setMetric(energy.getMetric());
        return entity;
    }

}
