package org.example;

public abstract class UserInfo {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String identityNo;

    public UserInfo(int id, String name, String surname, int age, String identityNo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identityNo = identityNo;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public abstract void print();
}
