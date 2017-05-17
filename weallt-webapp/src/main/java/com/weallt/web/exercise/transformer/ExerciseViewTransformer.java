package com.weallt.web.exercise.transformer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.exercise.domain.Exercise;
import com.weallt.web.exercise.domain.AddExerciseRequest;
import com.weallt.web.exercise.domain.ExerciseView;

@Component
public class ExerciseViewTransformer {
    
    @Autowired
    private MuscleGroupViewTransformer muscleGroupViewTransformer;

    public ExerciseView transform(Exercise exercise) {
        ExerciseView view = new ExerciseView();
        view.setId(exercise.getId());
        view.setName(exercise.getName());
        view.setVideoLink(exercise.getVideoLink());
        view.setTargetedMuscleGroups(exercise.getTargetedMuscleGroups());
        return view;
    }

    public List<ExerciseView> trasform(List<Exercise> exercises) {
        return exercises.stream().map(this::transform).collect(Collectors.toList());
    }
    
    public Exercise transform(AddExerciseRequest request){
        Exercise exercise = new Exercise();
        exercise.setName(request.getName());
        exercise.setVideoLink(request.getVideoLink());
        exercise.setTargetedMuscleGroups(muscleGroupViewTransformer.transform(request.getTargetedMuscleGroups()));
        return exercise;
    }
}
