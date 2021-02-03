package com.example.demo.Model;

public class User {

    private String fullName;
    private int age;
    private String gender;
    private boolean employed;

    public User() {

    }

    public User(String fullName, int age, String gender, boolean employed) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.employed = employed;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }
}
