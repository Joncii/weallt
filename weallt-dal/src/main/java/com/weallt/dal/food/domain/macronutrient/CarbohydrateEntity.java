package com.weallt.dal.food.domain.macronutrient;

import com.weallt.dal.food.domain.NutrientEntity;
import com.weallt.dal.food.domain.NutrientType;


public class CarbohydrateEntity extends NutrientEntity{

    public CarbohydrateEntity() {
        super();
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }
    
}
