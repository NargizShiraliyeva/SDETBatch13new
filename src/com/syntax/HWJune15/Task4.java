package com.syntax.HWJune15;

/*
Write a java class that have 4 constructors with 4 different access levels
 of constructors(private,public,default,protected) and create 4 objects of this class:
 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
 */
public class Task4 {
    private String name;
    private char grade;

    private int year;
    private String surname;
    private String country;

    private String greet;
    private String azGreet;

    private Task4(char grade, int year) {
        this.grade = grade;
        this.year = year;
        System.out.println("Your grade is - " + grade + " and your graduating year is -" + year);
    }

    public Task4(String name, String surname, String country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        System.out.println("Name - " + name + ", Surname - " + surname + ", Country - " + country);
    }

    Task4() {
        System.out.println("This default constructor do not have parameters");

    }

    protected Task4(String greet, String azGreet) {
        this.greet = greet;
        this.azGreet = azGreet;
        System.out.println(greet + " in Azerbaijani language is " + azGreet);
    }

    public static void main(String[] args) {

        Task4 taskPrivate = new Task4('A', 2022);
        Task4 taskProtected = new Task4("Hello", "Salam");
    }
  
}
//second execution is in Task4Test class
