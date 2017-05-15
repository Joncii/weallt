package com.weallt.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.food.domain.nutrient.EnergyPortion;
import com.weallt.web.food.domain.EnergyPortionView;

@Component
public class EnergyPortionViewTransformer {

    @Autowired
    private EnergyMetricViewTransformer energyMetricViewTransformer;

    public EnergyPortionView transform(EnergyPortion energy) {
        EnergyPortionView view = new EnergyPortionView();
        view.setMetric(energyMetricViewTransformer.transform(energy.getMetric()));
        view.setValue(energy.getValue());
        return view;
    }

    public EnergyPortion transform(EnergyPortionView view) {
        EnergyPortion energy = new EnergyPortion();
        energy.setMetric(energyMetricViewTransformer.transform(view.getMetric()));
        energy.setValue(view.getValue());
        return energy;
    }

}
