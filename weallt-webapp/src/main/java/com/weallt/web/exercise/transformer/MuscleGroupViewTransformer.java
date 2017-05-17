package com.weallt.web.exercise.transformer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.weallt.dal.exercise.domain.MuscleGroup;

@Component
public class MuscleGroupViewTransformer {

    public MuscleGroup transform(String stringValue) {
        return MuscleGroup.valueOf(stringValue);
    }

    public String transform(MuscleGroup muscleGroup) {
        return muscleGroup.toString();
    }

    public List<MuscleGroup> transform(List<String> stringValues) {
        return stringValues.stream().map(this::transform).collect(Collectors.toList());
    }

}
