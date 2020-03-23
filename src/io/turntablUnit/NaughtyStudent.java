package io.turntablUnit;

import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    @Override
    public double getAverageGrade()
    {
        double currentAverage = super.getAverageGrade() + (0.1 * super.getAverageGrade());
        if ( currentAverage <= 100.0){
            return currentAverage;
        }
        return  100.00;
    }

    @Override
    public void getLevel() {

    }

    @Override
    public void getName() {

    }
}



    /*public double getAverageGrade(){
        return getAverageGrade() + ((10.0/100)*getAverageGrade());

    }*/

}
