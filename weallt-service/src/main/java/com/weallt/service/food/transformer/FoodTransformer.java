package com.weallt.service.food.transformer;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.dal.food.domain.FoodEntity;
import com.weallt.service.food.domain.Food;

@Component
public class FoodTransformer {

    @Autowired
    private CarbohydratePortionTransformer carbohydratePortionTransformer;

    @Autowired
    private ProteinPortionTransformer proteinPortionTransformer;

    @Autowired
    private FatPortionTransformer fatPortionTransformer;

    @Autowired
    private WeightPortionTransformer portionTransformer;

    @Autowired
    private EnergyPortionTransformer energyPortionTransformer;

    public FoodEntity transform(Food food) {
        FoodEntity entity = new FoodEntity();
        entity.setId(food.getId());
        entity.setName(food.getName());
        entity.setPortion(portionTransformer.transform(food.getPortion()));
        entity.setCarbohydratePortion(carbohydratePortionTransformer.transform(food.getCarbohydratePortion()));
        entity.setProteinPortion(proteinPortionTransformer.transform(food.getProteinPortion()));
        entity.setFatPortion(fatPortionTransformer.transform(food.getFatPortion()));
        entity.setEnergy(energyPortionTransformer.transform(food.getEnergyPortion()));
        return entity;
    }

    public Food transformEntity(FoodEntity entity) {
        Food food = new Food();
        food.setId(entity.getId());
        food.setName(entity.getName());
        food.setPortion(portionTransformer.transform(entity.getPortion()));
        food.setCarbohydratePortion(carbohydratePortionTransformer.transform(entity.getCarbohydratePortion()));
        food.setProteinPortion(proteinPortionTransformer.transform(entity.getProteinPortion()));
        food.setFatPortion(fatPortionTransformer.transform(entity.getFatPortion()));
        food.setEnergyPortion(energyPortionTransformer.transform(entity.getEnergy()));
        return food;
    }

    public Set<Food> transformEntities(Collection<FoodEntity> entities) {
        return entities.stream().map(this::transformEntity).collect(Collectors.toSet());
    }

}
