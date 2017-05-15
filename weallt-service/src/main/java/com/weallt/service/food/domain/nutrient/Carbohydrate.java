package com.weallt.service.food.domain.nutrient;

import com.weallt.dal.food.domain.NutrientType;

public class Carbohydrate extends Nutrient{
    
    public Carbohydrate() {
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
