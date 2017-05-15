package com.weallt.web.food;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.food.FoodService;
import com.weallt.web.food.domain.AddFoodRequest;
import com.weallt.web.food.domain.FoodView;
import com.weallt.web.food.domain.ListFoodResponse;
import com.weallt.web.food.transformer.AddFoodRequestTransformer;
import com.weallt.web.food.transformer.FoodViewTransformer;
import com.weallt.web.food.transformer.ListFoodResponseTransformer;


@Component
public class FoodViewFacade {
    
    @Autowired
    private FoodService service;
    
    @Autowired
    private ListFoodResponseTransformer listFoodResponseTransformer;
    
    @Autowired
    private FoodViewTransformer foodViewTransformer;
    
    @Autowired
    private AddFoodRequestTransformer addFoodRequestTransformer;

    public void addFood(AddFoodRequest request){
        service.addFood(addFoodRequestTransformer.transform(request));
    }
    
    public ListFoodResponse listFoods(){
        return listFoodResponseTransformer.transform(service.listFoods());
    }
    
    public FoodView find(String objectId){
        return foodViewTransformer.transform(service.find(new ObjectId(objectId)));
    }
    
}
