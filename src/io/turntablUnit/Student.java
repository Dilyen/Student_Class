package io.turntablUnit;

import java.util.List;

abstract class Student implements Nameable, HasLevel {
    private List<Double> grades;
    private String name;
    private Level level;

    public Student (List<Double> grade, String name, Level level) {
        this.grades = grade;
        this.name = name;
        this.level = level;

    }
    public double getAverageGrade()
    {
        if ( grades.size() == 0){
            return  0.0;
        }
        double totalGradeSum = grades
                .stream().reduce(0.0, Double::sum);
        return ( totalGradeSum / grades.size());
    }
}
