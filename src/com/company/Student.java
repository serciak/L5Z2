package com.company;

public class Student {

    private int id;
    private String name;
    private String lastname;
    private double grade;

    public Student(int id, String name, String lastname, double grade) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public double getGrade() {
        return grade;
    }
}
