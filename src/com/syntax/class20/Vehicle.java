package com.syntax.class20;

public class Vehicle {

    int engineHP;
    String make;
    String model;
    String color;
}

class Car extends Vehicle {
    String stearingType;
    boolean autoPilot;
    int noOfWindows;
}
class BMW extends Car{

    int topSpeed;

    void printBasicInfo(){
        engineHP=500;
        System.out.println(engineHP);
    }
}