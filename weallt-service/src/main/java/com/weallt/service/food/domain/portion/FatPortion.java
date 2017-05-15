package com.weallt.service.food.domain.portion;

import com.weallt.service.food.domain.WeightPortion;
import com.weallt.service.food.domain.nutrient.Fat;

public class FatPortion {

    private Fat fat;

    private WeightPortion weightPortion;

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

    public WeightPortion getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortion weightPortion) {
        this.weightPortion = weightPortion;
    }

}
