package org.example;

import java.util.List;

public class Teacher extends UserInfo {
    private String department;
    private String courses;

    public Teacher(int id, String name, String surname, int age, String identityNo, String department, String courses) {
        super(id, name, surname, age, identityNo);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public void print() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Age: " + getAge());
        System.out.println("Identity No: " + getIdentityNo());
        System.out.println("Department: " + getDepartment());
        System.out.println("Courses: " + getCourses());
    }
}
