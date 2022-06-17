package com.syntax.HWJune15;
/*
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
 */
public class Students {

    private String name;
    private int mathGrade;
    private int compGrade;
    private int businessGrade;

    Students(String name, int mathGrade, int compGrade, int businessGrade) {
        this.name=name;
        this.mathGrade=mathGrade;
        this.compGrade=compGrade;
        this.businessGrade=businessGrade;
       int sum=(mathGrade+compGrade+businessGrade)/3;
        System.out.println(name+": average grade is "+sum);
    }

    public static void main(String[] args) {
        Students stu1=new Students("Nargiz", 89, 78, 75);
        Students stu2=new Students("Narmina", 95, 77,71);
        Students stu3=new Students("Nigar", 100,91, 89);

    }

    }

