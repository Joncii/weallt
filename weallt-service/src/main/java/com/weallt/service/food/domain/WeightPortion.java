package com.weallt.service.food.domain;

import com.weallt.dal.food.domain.WeightMetric;

public class WeightPortion {

    private Double value;

    private WeightMetric metric;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public WeightMetric getMetric() {
        return metric;
    }

    public void setMetric(WeightMetric metric) {
        this.metric = metric;
    }

}
