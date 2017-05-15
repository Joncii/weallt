package com.weallt.web.food.transformer;

import org.springframework.stereotype.Component;

import com.weallt.dal.food.domain.EnergyMetric;

@Component
public class EnergyMetricViewTransformer {

    public EnergyMetric transform(String stringValue) {
        EnergyMetric metric;
        switch (stringValue) {
        case "cal":
            metric = EnergyMetric.CALORIE;
            break;
        case "kcal":
            metric = EnergyMetric.KILOCALORIE;
            break;
        default:
            metric = EnergyMetric.CALORIE;
        }
        return metric;
    }

    public String transform(EnergyMetric energyMetric) {
        String metricView;
        switch (energyMetric) {
        case CALORIE:
            metricView = "cal";
            break;
        case KILOCALORIE:
            metricView = "kcal";
            break;
        default:
            metricView = "cal";
        }
        return metricView;
    }

}
