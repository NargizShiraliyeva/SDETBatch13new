package com.syntax.zPractice;

public class AreaTester {
    public static void main(String[] args) {
        Area rectangle=new Area(12, 15);
        rectangle.calcAreaOfRectangle();

        Area square=new Area(8);
        square.calcAreaOfSquare();

        Area box=new Area(9, 6,10);
        box.calcVolumeOfBox();
    }


}
