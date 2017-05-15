package com.weallt.service.food.domain.portion;

import com.weallt.service.food.domain.WeightPortion;
import com.weallt.service.food.domain.nutrient.Protein;

public class ProteinPortion {

    private Protein protein;

    private WeightPortion weightPortion;

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public WeightPortion getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortion weightPortion) {
        this.weightPortion = weightPortion;
    }

}
