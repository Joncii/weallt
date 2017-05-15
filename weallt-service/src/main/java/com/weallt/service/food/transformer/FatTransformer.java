package com.weallt.service.food.transformer;

import org.springframework.stereotype.Component;

import com.weallt.dal.food.domain.macronutrient.FatEntity;
import com.weallt.service.food.domain.nutrient.Fat;


@Component
public class FatTransformer {

    public Fat transform(FatEntity entity) {
        Fat fat = new Fat();
        fat.setNutrientType(entity.getNutrientType());
        return fat;
    }

    public FatEntity transform(Fat fat) {
        FatEntity entity = new FatEntity();
        entity.setNutrientType(fat.getNutrientType());
        return entity;
    }
}
