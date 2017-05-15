package com.weallt.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.food.domain.Food;
import com.weallt.web.food.domain.FoodView;


@Component
public class FoodViewTransformer {

    @Autowired
    private CarbohydratePortionViewTransformer carbohydratePortionViewTransformer;
    
    @Autowired
    private ProteinPortionViewTransformer proteinPortionViewTransformer;
    
    @Autowired
    private FatPortionViewTransformer fatPortionViewTransformer;
    
    public FoodView transform(Food food){
        FoodView foodView = new FoodView();
        foodView.setId(food.getId());
        foodView.setName(food.getName());
        foodView.setCarbohydrate(carbohydratePortionViewTransformer.transform(food.getCarbohydratePortion()));
        foodView.setProtein(proteinPortionViewTransformer.transform(food.getProteinPortion()));
        foodView.setFat(fatPortionViewTransformer.transform(food.getFatPortion()));
        return foodView;
    }
}
