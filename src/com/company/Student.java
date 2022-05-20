package com.company;

public class Student implements Comparable<Student> {

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

    public String toString() {
        return id + "\t" + lastname + "\t" + name + "\t" + grade;
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

    @Override
    public int compareTo(Student o) {
        CompoundComparator<Student> compoundComparator = new CompoundComparator<>();
        compoundComparator.addComparator(new IdComparator());
        compoundComparator.addComparator(new LastnameComparator());
        compoundComparator.addComparator(new NameComparator());
        return compoundComparator.compare(this, o);
    }
}
