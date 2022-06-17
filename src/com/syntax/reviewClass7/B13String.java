package com.syntax.reviewClass7;

public class B13String {
    //Best practice to always try to make all of your instance variable as private
    private String str;
    public B13String(String str){
        this.str=str;
        //this.number; error as there is no instance variable number
        int number;
    }

    //write a method that can tell me how many times a character is being repeated in a string

    public int countChars(char c){

       int counter=0;
        for(char cha:str.toCharArray()){
            if(cha==c){
                counter++;
            }
        }
        return counter;
    }
}
