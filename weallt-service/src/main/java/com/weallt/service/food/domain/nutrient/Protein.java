package com.weallt.service.food.domain.nutrient;

import com.weallt.dal.food.domain.NutrientType;

public class Protein extends Nutrient{
    
    public Protein() {
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
