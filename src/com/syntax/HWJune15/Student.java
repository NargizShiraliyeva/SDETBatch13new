package com.syntax.HWJune15;

/*
Write a Student class   that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given  student using displayInfo method.
*/
public class Student {
    private String name;
    private String address;
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo() {
        System.out.println("Name is " + name + ", address is " + address);
    }
    public static void main(String[] args) {
        Student info = new Student("Nargiz", "Toronto, Canada");
        info.displayInfo();
    }
}

