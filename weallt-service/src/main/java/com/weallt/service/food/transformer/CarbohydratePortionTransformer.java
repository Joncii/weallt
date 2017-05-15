package com.weallt.service.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.dal.food.domain.portion.CarbohydratePortionEntity;
import com.weallt.service.food.domain.portion.CarbohydratePortion;


@Component
public class CarbohydratePortionTransformer {

    @Autowired
    private CarbohydrateTransformer carbohydrateTransformer;

    @Autowired
    private WeightPortionTransformer weightPortionTransformer;

    public CarbohydratePortion transform(CarbohydratePortionEntity entity) {
        CarbohydratePortion carbohydratePortion = new CarbohydratePortion();
        carbohydratePortion.setCarbohydrate(carbohydrateTransformer.transform(entity.getCarbohydrate()));
        carbohydratePortion.setWeightPortion(weightPortionTransformer.transform(entity.getWeightPortion()));
        return carbohydratePortion;
    }

    public CarbohydratePortionEntity transform(CarbohydratePortion carbohydratePortion) {
        CarbohydratePortionEntity entity = new CarbohydratePortionEntity();
        entity.setCarbohydrate(carbohydrateTransformer.transform(carbohydratePortion.getCarbohydrate()));
        entity.setWeightPortion(weightPortionTransformer.transform(carbohydratePortion.getWeightPortion()));
        return entity;
    }

}
