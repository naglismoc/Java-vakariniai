package com.companija;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private int age;
    private ArrayList<Integer> grades;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String name) {
        this.name = name;
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

    public Student() {
        this.grades = new ArrayList<>();
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public void introduce() {
        System.out.println("Hi, my name is " + this.name + ", surname - " + this.surname);
    }

    public double gradesAverage() {
        double sum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            sum += (double) this.grades.get(i);
        }
        return sum / this.grades.size();
    }

    public static void classInfo() {
        System.out.println("this class has 11 methods");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
