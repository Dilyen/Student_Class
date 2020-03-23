package io.turntablUnit;

import java.util.LinkedList;
import java.util.List;

public class BagOfLecturers {
    private List<Lecture> lectures = new LinkedList<>();

    void add(Lecture lecture){
        this.lectures.add(lecture);
    }
    void remove(Lecture lecture){
        this.lectures.remove(lecture);
    }
    void clear(){
        this.lectures.clear();
    }










    /*int size(){
        return this.lectures.size();
    }*/
}
