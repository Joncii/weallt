package com.weallt.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.food.domain.nutrient.Carbohydrate;
import com.weallt.service.food.domain.portion.CarbohydratePortion;
import com.weallt.web.food.domain.CarbohydratePortionView;


@Component
public class CarbohydratePortionViewTransformer {
    
    @Autowired
    private WeightPortionViewTransformer portionViewTransformer;

    public CarbohydratePortion transform(CarbohydratePortionView view) {
        CarbohydratePortion carbohydratePortion = new CarbohydratePortion();
        carbohydratePortion.setCarbohydrate(new Carbohydrate());
        carbohydratePortion.setWeightPortion(portionViewTransformer.transform(view.getWeightPortion()));
        return carbohydratePortion;
    }
    
    public CarbohydratePortionView transform(CarbohydratePortion carbohydratePortion){
        CarbohydratePortionView carbohydratePortionView = new CarbohydratePortionView();
        carbohydratePortionView.setWeightPortion(portionViewTransformer.transform(carbohydratePortion.getWeightPortion()));
        return carbohydratePortionView;
    }

}
