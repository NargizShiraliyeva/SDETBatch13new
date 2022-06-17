package com.syntax.class16;

public class Students {
    String name;
    int id;
    static int numbersOfStudents = 12;

    public static void main(String[] args) {
        Students stu1 = new Students();
        Students stu2 = new Students();
        Students stu3 = new Students();

        stu1.name = "Narmina";
        stu1.id = 2654;
        numbersOfStudents++;
        stu2.name = "Nargiz";
        stu2.id = 2655;
        numbersOfStudents++;
        stu3.name = "Nigar";
        stu3.id = 2656;
        numbersOfStudents++;

        System.out.println("Total numbers of students is " + numbersOfStudents);

    }
}
