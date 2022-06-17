package com.syntax.class16;

public class SyntaxEmployee {
    int empID;
    int salary;
    static String ceo="Sumair";
    void displayEmpInfo(){
        System.out.println(empID+", "+salary+ ", "+ceo);
    }
    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID=2565;
        emp1.salary=100000;
        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID=2566;
        emp1.salary=90000;
emp1.displayEmpInfo();
emp2.displayEmpInfo();
    }

}
