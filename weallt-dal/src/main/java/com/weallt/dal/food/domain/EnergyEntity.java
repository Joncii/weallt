package com.weallt.dal.food.domain;

public class EnergyEntity {
    
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
