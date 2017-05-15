package com.weallt.dal.food.domain.macronutrient;

import com.weallt.dal.food.domain.NutrientEntity;
import com.weallt.dal.food.domain.NutrientType;

public class FatEntity extends NutrientEntity {
    
    public FatEntity() {
        super();
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
