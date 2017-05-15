package com.weallt.web.food.transformer;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.weallt.service.food.domain.Food;
import com.weallt.web.food.domain.FoodNameView;
import com.weallt.web.food.domain.ListFoodResponse;


@Component
public class ListFoodResponseTransformer {
    
    public ListFoodResponse transform(Set<Food> foods){
        ListFoodResponse response = new ListFoodResponse();
        Set<FoodNameView> foodViews = foods.stream().map(this::transform).collect(Collectors.toSet());
        response.setFoods(foodViews);
        return response;
    }
    
    public FoodNameView transform(Food food){
        FoodNameView foodView = new FoodNameView();
        foodView.setId(food.getId());
        foodView.setName(food.getName());
        return foodView;
    }

}
