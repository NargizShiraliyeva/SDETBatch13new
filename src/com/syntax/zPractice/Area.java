package com.syntax.zPractice;
/*
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
Use separate class to test your code
 */
public class Area {

 int length;
int width;
int side;
int height;

    public Area(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Area(int side){
        this.side=side;
    }
    public Area(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    void calcAreaOfRectangle(){
        System.out.println("The area of the rectangle is "+(length*width));
    }
    void calcAreaOfSquare(){
        System.out.println("The are of the square is "+side*side);
    }
    void calcVolumeOfBox(){
        System.out.println("The volume of the box is "+length*width*height);
    }
    }

