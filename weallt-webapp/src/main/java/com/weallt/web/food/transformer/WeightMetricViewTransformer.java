package com.weallt.web.food.transformer;

import org.springframework.stereotype.Component;

import com.weallt.dal.food.domain.WeightMetric;


@Component
public class WeightMetricViewTransformer {

    public WeightMetric transform(String stringValue) {
        WeightMetric metric;
        switch (stringValue) {
        case "μg":
            metric = WeightMetric.MICROGRAMMS;
            break;
        case "mg":
            metric = WeightMetric.MILLIGRAMMS;
            break;
        case "g":
            metric = WeightMetric.GRAMMS;
            break;
        default:
            metric = WeightMetric.GRAMMS;
        }
        return metric;
    }

    public String transform(WeightMetric weightMetric) {
        String metricView;
        switch (weightMetric) {
        case MICROGRAMMS:
            metricView = "μg";
            break;
        case MILLIGRAMMS:
            metricView = "mg";
            break;
        case GRAMMS:
            metricView = "g";
            break;
        default:
            metricView = "g";
        }
        return metricView;
    }

}
