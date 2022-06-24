package com.syntax.zPractice;
/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class OverloadingTask2 {
    private void print(String homeCountry){
        System.out.println("My home country is "+homeCountry);
    }
    private void print(int degree, String city){
        System.out.println("It is "+degree+" degrees in "+city);
    }
     private void print(double price, String item) {
        System.out.println("The price of the "+item+" is "+price);
    }

    public static void main(String[] args) {
        OverloadingTask2 m1=new OverloadingTask2();
        m1.print("Azerbaijan");
        m1.print(26.99, "T-shirt");
        m1.print(31, "Toronto");
    }
    }

