package com.weallt.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.food.domain.Food;
import com.weallt.web.food.domain.AddFoodRequest;
import com.weallt.web.food.domain.WeightPortionView;

@Component
public class AddFoodRequestTransformer {

    @Autowired
    private CarbohydratePortionViewTransformer carbohydrateViewTransformer;

    @Autowired
    private ProteinPortionViewTransformer proteinViewTransformer;

    @Autowired
    private FatPortionViewTransformer fatViewTransformer;

    @Autowired
    private WeightPortionViewTransformer portionViewTransformer;
    
    @Autowired
    private EnergyPortionViewTransformer energyPortionViewTransformer;

    public Food transform(AddFoodRequest request) {
        Food food = new Food();
        food.setName(request.getName());
        food.setCarbohydratePortion(carbohydrateViewTransformer.transform(request.getCarbohydrate()));
        food.setProteinPortion(proteinViewTransformer.transform(request.getProtein()));
        food.setFatPortion(fatViewTransformer.transform(request.getFat()));
        food.setEnergyPortion(energyPortionViewTransformer.transform(request.getEnergy()));
        WeightPortionView weightPortionView = new WeightPortionView();
        weightPortionView.setMetric("g");
        weightPortionView.setValue(100.0);
        food.setPortion(portionViewTransformer.transform(weightPortionView));
        return food;
    }

}
