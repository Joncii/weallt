package com.weallt.dal.food.domain;

public enum WeightMetric {

    MICROGRAMMS("μg"), MILLIGRAMMS("mg"), GRAMMS("g");
    
    private final String name;

    private WeightMetric(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
