package com.weallt.service.food.domain.nutrient;

import com.weallt.dal.food.domain.NutrientType;

public abstract class Nutrient {

    private NutrientType nutrientType;

    public NutrientType getNutrientType() {
        return nutrientType;
    }

    public void setNutrientType(NutrientType nutrientType) {
        this.nutrientType = nutrientType;
    }

}
