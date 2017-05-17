package com.weallt.dal.exercise.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.weallt.dal.exercise.domain.ExerciseEntity;

@Repository
public interface ExerciseRepository extends MongoRepository<ExerciseEntity, ObjectId> {

}
