package com.companija;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student studentas = new Student();
//        studentas.age = 17;
//        studentas.name = "Juozapas";
        studentas.setName("Juozapas");
//        studentas.surname = "Giedraitis";
        studentas.setSurname("Giedraitis");
//        studentas.grades.add(9);
//        studentas.grades.add(10);
        studentas.addGrade(9);
        studentas.addGrade(10);

        Student studentas3 = new Student("Algis", "Ramanauskas",
                54);

        ArrayList<Student> students = new ArrayList<>();
        students.add(studentas);
        students.add(studentas3);

        String text = "";
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.print(student.getName() + " " + student.getSurname() + " ");
            for (int a = 0; a < student.getGrades().size(); a++) {
                int grade = student.getGrades().get(a);
                System.out.print(grade + ", ");
                text = text + grade + ", ";
            }
            System.out.println();
            System.out.println(text);
        }
        System.out.println( 4 + 3 + " labas"); //7labas
        System.out.println( "labas " + 4 + 3 );//labas43

        System.out.println(studentas);
        studentas.introduce();
        studentas3.introduce();
        System.out.println(studentas);
        System.out.println( studentas.gradesAverage());
        System.out.println(studentas);
        System.out.println(studentas3);

        Student.classInfo();
        Math.random();

        System.out.println( HelperClass.average(studentas.getGrades()));
        HelperClass.distance();



    }


}
