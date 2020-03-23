package io.turntablUnit;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void getAverage(){
        Student levelOneStudents = new Student(Arrays.asList(5.0, 3.0, 4.0));
        assertEquals(4.0, levelOneStudents.getAverageGrade());
    }
    @Test
    void getAverageTwo(){
        Student levelTwoStudents = new Student(Arrays.asList(70.0, 84.0, 66.0));
        assertEquals(66.0, levelTwoStudents.getAverageGrade());
    }
    @Test
    void getNaughtyStudentAverage(){
        NaughtyStudent naughtyStudent = new NaughtyStudent(Arrays.asList(10.0, super.getAverageGrade() ));
        assertEquals(11.0, naughtyStudent.getAverageGrade());
    }
    @Test
    void



}