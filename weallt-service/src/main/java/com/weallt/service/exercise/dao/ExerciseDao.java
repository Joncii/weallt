package com.weallt.service.exercise.dao;

import java.util.List;

import com.weallt.service.exercise.domain.Exercise;

public interface ExerciseDao {
    
    List<Exercise> listAll();
    
    void add(Exercise exercise);
    
    Exercise getById(String id);

}
