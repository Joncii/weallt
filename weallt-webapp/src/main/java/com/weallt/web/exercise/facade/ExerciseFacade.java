package com.weallt.web.exercise.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weallt.service.exercise.ExerciseService;
import com.weallt.web.exercise.domain.AddExerciseRequest;
import com.weallt.web.exercise.domain.ExerciseView;
import com.weallt.web.exercise.domain.ListExerciseResponse;
import com.weallt.web.exercise.transformer.ExerciseViewTransformer;
import com.weallt.web.exercise.transformer.ListExerciseViewTransformer;

@Component
public class ExerciseFacade {

    @Autowired
    private ExerciseService exerciseService;
    
    @Autowired
    private ExerciseViewTransformer exerciseViewTransformer;
    
    @Autowired
    private ListExerciseViewTransformer listExerciseViewTransformer;
    
    public ListExerciseResponse listAll(){
        return listExerciseViewTransformer.transform(exerciseService.listAll());
    }
    
    public void addExercise(AddExerciseRequest request){
        exerciseService.add(exerciseViewTransformer.transform(request));
    }
    
    public ExerciseView getById(String id){
        return exerciseViewTransformer.transform(exerciseService.getById(id));
    }
}
