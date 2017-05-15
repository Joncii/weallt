package com.weallt.dal.food.domain.portion;

import com.weallt.dal.food.domain.macronutrient.CarbohydrateEntity;

public class CarbohydratePortionEntity {

    private CarbohydrateEntity carbohydrate;

    private WeightPortionEntity weightPortion;

    public CarbohydrateEntity getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(CarbohydrateEntity carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public WeightPortionEntity getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortionEntity weightPortion) {
        this.weightPortion = weightPortion;
    }

}
