package org.example;

public class Personel extends UserInfo {
    private String job;

    public Personel(int id, String name, String surname, int age, String identityNo, String job) {
        super(id, name, surname, age, identityNo);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void print() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Age: " + getAge());
        System.out.println("Identity No: " + getIdentityNo());
        System.out.println("Job: " + getJob());
    }
}
