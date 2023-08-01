package org.example;

public class Student extends UserInfo {
    //private double average;

    public Student(int id, String name, String surname, int age, String identityNo) {
        super(id, name, surname, age, identityNo);
        //this.average = average;
    }

    /*public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }*/

    @Override
    public void print() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Age: " + getAge());
        System.out.println("Identity No: " + getIdentityNo());
        //System.out.println("Average: " + getAverage());
    }
}
