package com.weallt.service.exercise.transformer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.weallt.dal.exercise.domain.ExerciseEntity;
import com.weallt.service.exercise.domain.Exercise;

@Component
public class ExerciseTransformer {

    public Exercise transform(ExerciseEntity entity) {
        Exercise exercise = new Exercise();
        exercise.setId(entity.getId());
        exercise.setName(entity.getName());
        exercise.setVideoLink(entity.getVideoLink());
        exercise.setTargetedMuscleGroups(entity.getTargetedMuscleGroups());
        return exercise;
    }

    public List<Exercise> transform(List<ExerciseEntity> entities) {
        return entities.stream().map(this::transform).collect(Collectors.toList());
    }

    public ExerciseEntity transform(Exercise exercise) {
        ExerciseEntity entity = new ExerciseEntity();
        entity.setId(exercise.getId());
        entity.setName(exercise.getName());
        entity.setVideoLink(exercise.getVideoLink());
        entity.setTargetedMuscleGroups(exercise.getTargetedMuscleGroups());
        return entity;
    }

}
