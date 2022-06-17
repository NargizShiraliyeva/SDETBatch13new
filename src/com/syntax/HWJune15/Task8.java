package com.syntax.HWJune15;
/*
Write a java class that will have a constructor: one with parameters and second without any parameters.
 Create a separate Test class where you will execute both of the constructors 1 by 1.
 */
public class Task8 {

    private String name;
    private String surname;

    Task8(String name, String surname){
        this.name=name;
        this.surname=surname;
        System.out.println("My name is "+name+" and surname is "+surname);
    }
    Task8(String nargiz, int i, int i1, int i2){
        System.out.println("This constructor do not have parameters");
    }

    }

