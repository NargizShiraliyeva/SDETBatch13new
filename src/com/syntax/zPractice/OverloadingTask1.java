package com.syntax.zPractice;
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class OverloadingTask1 {
    static void printOut(String name, int age){
        System.out.println("My name is "+name+" and my age is "+age);
    }
    static void printOut(int num1, int num2){
        System.out.println("The sum of two numbers is "+(num1+num2));
    }
    static void printOut(String coutry, String province, String capitalCity){
        System.out.println("Country name - "+coutry+", province - "+province+", capital - "+capitalCity);
    }
    public static void main(String[] args) {
        printOut(5, 6);
        printOut("Canada", "ON", "Ottawa");
        printOut("Nargiz", 31);
    }
}
