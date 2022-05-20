package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5, "Jakub", "Seredynski", 5.5));
        students.add(new Student(10, "Jakub", "Lewy", 3.5));
        students.add(new Student(1, "Maciej", "Boinski", 3));
        students.add(new Student(7, "Pawel", "Olszewski", 4.5));
        students.add(new Student(3, "Kacper", "Piatek", 4.5));

        CompoundComparator<Student> compoundComparator = new CompoundComparator<>();
        compoundComparator.addComparator(new NameComparator());
        compoundComparator.addComparator(new LastnameComparator());

        System.out.println("Komparator po imieniu i nazwisku");
        students.sort(compoundComparator);
        System.out.println(students);
    }
}
