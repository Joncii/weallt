package com.weallt.service.food.transformer;

import org.springframework.stereotype.Component;

import com.weallt.dal.food.domain.macronutrient.CarbohydrateEntity;
import com.weallt.service.food.domain.nutrient.Carbohydrate;


@Component
public class CarbohydrateTransformer {

    public Carbohydrate transform(CarbohydrateEntity entity) {
        Carbohydrate carbohydrate = new Carbohydrate();
        carbohydrate.setNutrientType(entity.getNutrientType());
        return carbohydrate;
    }

    public CarbohydrateEntity transform(Carbohydrate carbohydrate) {
        CarbohydrateEntity entity = new CarbohydrateEntity();
        entity.setNutrientType(carbohydrate.getNutrientType());
        return entity;
    }

}
