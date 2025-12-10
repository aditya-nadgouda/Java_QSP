package com.oops.encapsulation.atm;

public class ATM {
    double amount = 100000;
    public void withdraw (){
        System.out.println("You can withdraw now !!!");
    }
}
//Driver class - because it's having main method
class BOM {

    public static void main(String[] args) {
        ATM ref = new ATM();
        System.out.println("Amount in ATM : "+ref.amount);
        ref.withdraw();
    }
}