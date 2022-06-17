package com.syntax.class16;

public class StaticDemo {

    static int noIfEmployees=10;
    String name;

    static void method1(){
        System.out.println(noIfEmployees);
       // System.out.println(name); because each object will be having a seperate copy
        //of this name variable java gets confused and will give an error. instance cannot be stored in static void
    }
    void method2(){
        System.out.println(noIfEmployees);
        System.out.println(name);
    }

    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();
        st.name="Omid";
        StaticDemo st2=new StaticDemo();
        st2.name="Rachid";

        st.method2();
    }
}
