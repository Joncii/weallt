package com.weallt.dal.food.domain;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.weallt.dal.food.domain.portion.CarbohydratePortionEntity;
import com.weallt.dal.food.domain.portion.FatPortionEntity;
import com.weallt.dal.food.domain.portion.ProteinPortionEntity;
import com.weallt.dal.food.domain.portion.WeightPortionEntity;

@Document(collection = "food")
public class FoodEntity {

    @Id
    private String id;

    private String name;

    private EnergyEntity energy;

    private CarbohydratePortionEntity carbohydratePortion;

    private ProteinPortionEntity proteinPortion;

    private FatPortionEntity fatPortion;

    private WeightPortionEntity portion;

    public WeightPortionEntity getPortion() {
        return portion;
    }

    public void setPortion(WeightPortionEntity portion) {
        this.portion = portion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnergyEntity getEnergy() {
        return energy;
    }

    public void setEnergy(EnergyEntity energy) {
        this.energy = energy;
    }

    public CarbohydratePortionEntity getCarbohydratePortion() {
        return carbohydratePortion;
    }

    public void setCarbohydratePortion(CarbohydratePortionEntity carbohydratePortion) {
        this.carbohydratePortion = carbohydratePortion;
    }

    public ProteinPortionEntity getProteinPortion() {
        return proteinPortion;
    }

    public void setProteinPortion(ProteinPortionEntity proteinPortion) {
        this.proteinPortion = proteinPortion;
    }

    public FatPortionEntity getFatPortion() {
        return fatPortion;
    }

    public void setFatPortion(FatPortionEntity fatPortion) {
        this.fatPortion = fatPortion;
    }

}
