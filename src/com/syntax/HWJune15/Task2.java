package com.syntax.HWJune15;
/*Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.*/
public class Task2 {

    public static String str(String strg) {
     String newStr= null;
     for (int i=strg.length()-1; i>=0; i--){
         newStr +=strg.charAt(i);
     }
     return newStr;

}
    public static void main(String[] args) {
        System.out.println(Task2.str("Hello Syntax Class"));
    }
}


