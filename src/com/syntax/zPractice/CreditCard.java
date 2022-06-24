package com.syntax.zPractice;
/*
Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes. */
public class CreditCard {
    double balance;
    double interest;
    void calculateRate(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println("Interest rate is "+balance*(interest/100));
    }
}
class Visa extends CreditCard{
}
class AX extends CreditCard{
    void calculateRate(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println("Interest rate for your AX card is "+balance*(interest/100));
    }
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculateRate(5000.69, 1.75);

        Visa visa=new Visa();
        visa.calculateRate(200.36, 1.32);

        AX ax=new AX();
        ax.calculateRate(65000.36, 1.96);
    }
}