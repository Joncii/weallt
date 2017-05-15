package com.weallt.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.food.domain.WeightPortion;
import com.weallt.web.food.domain.WeightPortionView;


@Component
public class WeightPortionViewTransformer {

    @Autowired
    private WeightMetricViewTransformer weightMetricViewTransformer;

    public WeightPortion transform(WeightPortionView view) {
        WeightPortion portion = new WeightPortion();
        portion.setMetric(weightMetricViewTransformer.transform(view.getMetric()));
        portion.setValue(view.getValue());
        return portion;
    }

    public WeightPortionView transform(WeightPortion weightPortion) {
        WeightPortionView view = new WeightPortionView();
        view.setMetric(weightMetricViewTransformer.transform(weightPortion.getMetric()));
        view.setValue(weightPortion.getValue());
        return view;
    }

}
