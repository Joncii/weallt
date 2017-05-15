package com.weallt.dal.food.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.weallt.dal.food.domain.FoodEntity;


@Repository
public interface FoodRepository extends MongoRepository<FoodEntity, ObjectId> {

}
