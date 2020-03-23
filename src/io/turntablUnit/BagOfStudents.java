package io.turntablUnit;

import java.util.LinkedList;
import java.util.List;

public class BagOfStudents {
    private List<Student> students = new LinkedList<>();

    void add(Student student){
        this.students.add(student);
    }
    void remove(Student student){
        this.students.remove(student);
    }
    void clear(Student student){
        this.students.clear();
    }









    /*int size(){
        return this.students.size();
    }*/
}
