package com.weallt.service.exercise.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.dal.exercise.repository.ExerciseRepository;
import com.weallt.service.exercise.domain.Exercise;
import com.weallt.service.exercise.transformer.ExerciseTransformer;

@Component
public class DefaultExerciseDao implements ExerciseDao {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private ExerciseTransformer exerciseTransformer;

    @Override
    public List<Exercise> listAll() {
        return exerciseTransformer.transform(exerciseRepository.findAll());
    }

    @Override
    public void add(Exercise exercise) {
        exerciseRepository.insert(exerciseTransformer.transform(exercise));
    }

    @Override
    public Exercise getById(String id) {
        return exerciseTransformer.transform(exerciseRepository.findOne(new ObjectId(id)));
    }

}
