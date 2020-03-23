package io.turntablUnit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.*;

public class Lecture {
    public void private List<Student> students;

    public Lecture() {
        this.students = new ArrayList<>();
    }

    public void Enter(Student students){
        this.students.add(students);
    }

    public double getHighestAverageGrade(){

        Optional<Student> highestGradeStudent = this.students.stream()
                .max(Comparator.comparing( Student::getAverageGrade));
        return highestGradeStudent.map(Student::getAverageGrade)
                .orElse(0.0);
    }

}
