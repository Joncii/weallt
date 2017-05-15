package com.weallt.dal.food.domain.macronutrient;

import com.weallt.dal.food.domain.NutrientEntity;
import com.weallt.dal.food.domain.NutrientType;

public class ProteinEntity extends NutrientEntity {
    
    public ProteinEntity() {
        super();
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
