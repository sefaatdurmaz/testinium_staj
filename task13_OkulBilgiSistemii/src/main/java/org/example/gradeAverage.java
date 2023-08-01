package org.example;
public class gradeAverage extends Student{

    private double average;
    public gradeAverage(int id, String name, String surname, int age, String identityNo, double average) {
        super(id, name, surname, age, identityNo);

        this.average = average;

    }
    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
