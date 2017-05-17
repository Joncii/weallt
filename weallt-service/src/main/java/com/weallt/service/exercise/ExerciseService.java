package com.weallt.service.exercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weallt.service.exercise.dao.ExerciseDao;
import com.weallt.service.exercise.domain.Exercise;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseDao exerciseDao;

    public List<Exercise> listAll() {
        return exerciseDao.listAll();
    }

    public void add(Exercise exercise) {
        exerciseDao.add(exercise);
    }
    
    public Exercise getById(String id){
        return exerciseDao.getById(id);
    }

}
