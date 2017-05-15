package com.weallt.service.food.domain.nutrient;

import com.weallt.dal.food.domain.EnergyMetric;

public class EnergyPortion {

    private Double value;

    private EnergyMetric metric;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public EnergyMetric getMetric() {
        return metric;
    }

    public void setMetric(EnergyMetric metric) {
        this.metric = metric;
    }

}
