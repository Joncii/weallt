package com.weallt.web.exercise.domain;

import java.util.List;

public class ListExerciseResponse {

    private List<ExerciseNameView> exercises;

    public List<ExerciseNameView> getExercises() {
        return exercises;
    }

    public void setExercises(List<ExerciseNameView> exercises) {
        this.exercises = exercises;
    }

}
