package com.weallt.dal.food.domain;

public enum EnergyMetric {
    
    CALORIE("cal"), KILOCALORIE("kcal");
    
    private final String name;
    
    private EnergyMetric(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
