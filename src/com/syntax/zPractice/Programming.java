package com.syntax.zPractice;
/*
Create a class named 'Programming'.
While creating an object of the class, if nothing is passed to it, then the message "I love programming languages"
should be printed.
If some String is passed to it, then in place of "programming languages" the value variable should be printed.
Example, if we pass "Java", then "I love Java" should be printed.
 */
public class Programming {

    static void print(){
        System.out.println("I love programming language");
    }
    static void print(String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        print("Java");
    }
}
