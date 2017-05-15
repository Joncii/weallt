package com.weallt.dal.food.domain.portion;

import com.weallt.dal.food.domain.macronutrient.ProteinEntity;

public class ProteinPortionEntity {

    private ProteinEntity protein;

    private WeightPortionEntity weightPortion;

    public ProteinEntity getProtein() {
        return protein;
    }

    public void setProtein(ProteinEntity protein) {
        this.protein = protein;
    }

    public WeightPortionEntity getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortionEntity weightPortion) {
        this.weightPortion = weightPortion;
    }

}
