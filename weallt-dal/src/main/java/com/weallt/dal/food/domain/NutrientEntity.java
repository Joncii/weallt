package com.weallt.dal.food.domain;

public abstract class NutrientEntity {

    private NutrientType nutrientType;

    public NutrientType getNutrientType() {
        return nutrientType;
    }

    public void setNutrientType(NutrientType nutrientType) {
        this.nutrientType = nutrientType;
    }

}
