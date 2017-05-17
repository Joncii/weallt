package com.weallt.dal.exercise.domain;

public enum MuscleGroup {

    NECK("NECK"), TRAPS("TRAPS"), SHOULDERS("SHOULDERS"), CHEST("CHEST"), BICEPS("BICEPS"), FOREARMS("FOREARMS"), ABS(
            "ABS"), QUADS("QUADS"), CALVES("CALVES"), LATS("LATS"), TRICEPS("TRICEPS"), MIDDLEBACK(
                    "MIDDLEBACK"), LOWERBACK("LOWERBACK"), GLUTES("GLUTES"), HAMSTRINGS("HAMSTRINGS");

    private String name;

    private MuscleGroup(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
