package com.weallt.web.exercise.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weallt.dal.exercise.domain.MuscleGroup;
import com.weallt.web.exercise.domain.AddExerciseRequest;
import com.weallt.web.exercise.domain.ExerciseView;
import com.weallt.web.exercise.domain.ListExerciseResponse;
import com.weallt.web.exercise.facade.ExerciseFacade;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseFacade exerciseFacade;

    @RequestMapping(value = "/exercise/musclegroups", method = RequestMethod.GET)
    public List<String> retrieveMuscleGroups() {
        return Stream.of(MuscleGroup.values()).map(m -> m.toString()).collect(Collectors.toList());
    }

    @RequestMapping(value = "/exercises", method = RequestMethod.GET)
    public ListExerciseResponse listExercises() {
        return exerciseFacade.listAll();
    }
    
    @RequestMapping(value = "/exercise/add", method = RequestMethod.PUT)
    public void addExercise(@RequestBody AddExerciseRequest request) {
        exerciseFacade.addExercise(request);
    }
    
    @RequestMapping(value = "/exercise/{objectId}", method = RequestMethod.GET)
    public ExerciseView getById(@PathVariable("objectId") String objectId) {
        return exerciseFacade.getById(objectId);
    }

}
