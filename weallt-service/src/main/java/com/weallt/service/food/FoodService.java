package com.weallt.service.food;

import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weallt.service.food.dao.FoodDao;
import com.weallt.service.food.domain.Food;

@Service
public class FoodService {
    
    @Autowired
    private FoodDao foodDao;
    
    public void addFood(Food food){
        foodDao.addFood(food);
    }
    
    public Set<Food> listFoods(){
        return foodDao.listFoods();
    }
    
    public Food find(ObjectId objectId){
        return foodDao.find(objectId);
    }

}
