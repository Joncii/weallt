package com.weallt.dal.exercise.domain;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exercise")
public class ExerciseEntity {

    @Id
    private String id;

    private String name;

    private String videoLink;

    private List<MuscleGroup> targetedMuscleGroups;

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

    public List<MuscleGroup> getTargetedMuscleGroups() {
        return targetedMuscleGroups;
    }

    public void setTargetedMuscleGroups(List<MuscleGroup> targetedMuscleGroups) {
        this.targetedMuscleGroups = targetedMuscleGroups;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
