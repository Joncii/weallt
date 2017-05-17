package com.weallt.web.exercise.domain;

import java.util.List;

public class AddExerciseRequest {

    private String name;

    private String videoLink;

    private List<String> targetedMuscleGroups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public List<String> getTargetedMuscleGroups() {
        return targetedMuscleGroups;
    }

    public void setTargetedMuscleGroups(List<String> targetedMuscleGroups) {
        this.targetedMuscleGroups = targetedMuscleGroups;
    }

}
