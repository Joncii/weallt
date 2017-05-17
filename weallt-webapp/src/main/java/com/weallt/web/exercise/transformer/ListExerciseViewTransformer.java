package com.weallt.web.exercise.transformer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.weallt.service.exercise.domain.Exercise;
import com.weallt.web.exercise.domain.ExerciseNameView;
import com.weallt.web.exercise.domain.ListExerciseResponse;

@Component
public class ListExerciseViewTransformer {

    public ExerciseNameView transform(Exercise exercise) {
        ExerciseNameView view = new ExerciseNameView();
        view.setId(exercise.getId());
        view.setName(exercise.getName());
        return view;
    }

    public ListExerciseResponse transform(List<Exercise> exercises) {
        ListExerciseResponse response = new ListExerciseResponse();
        response.setExercises(exercises.stream().map(this::transform).collect(Collectors.toList()));
        return response;
    }

}
