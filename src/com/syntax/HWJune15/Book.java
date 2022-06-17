package com.syntax.HWJune15;
/*
Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */
public class Book {

    private String name;
    private int year;
    private int noOfPages;
    private String author;

    Book(String name, String author){
        this.name=name;
        this.author=author;
        System.out.println("Name of the book is "+name+", author of this book is "+author);
    }
    Book(int year, int noOfPages){
        this.year=year;
        this.noOfPages=noOfPages;
        System.out.println("This book was released in "+year+", number of pages is "+noOfPages);
    }

    public static void main(String[] args) {
        Book book1=new Book("The Little Prince","Antoine de Saint-Exupery");
        Book book2=new Book(1943, 96);
    }
}
