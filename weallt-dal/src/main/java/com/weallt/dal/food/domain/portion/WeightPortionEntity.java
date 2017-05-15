package com.weallt.dal.food.domain.portion;

import com.weallt.dal.food.domain.WeightMetric;

public class WeightPortionEntity {

    private double value;

    private WeightMetric metric;

    public double getValue() {
        return value;
    }

    public WeightMetric getMetric() {
        return metric;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setMetric(WeightMetric metric) {
        this.metric = metric;
    }

}
