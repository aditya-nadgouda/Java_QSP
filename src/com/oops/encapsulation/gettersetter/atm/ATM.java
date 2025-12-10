package com.oops.encapsulation.gettersetter.atm;

public class ATM {
    private double money = 1000000; // state

    // getter - to access the required private value
    public double getMoney(){
        return this.money;
    }
    // setter - to set the required private value
    public void setMoney (double money){
        this.money=money;
    }

    public void withdraw (){
        System.out.println("Withdraw the money !!!");
    }
}


//Driver class

class ICICI {

    public static void main(String[] args) {

        ATM ref = new ATM();
        double money = 1500000;

        // set money
        ref.setMoney(money);

        // get money
        System.out.println("Money in ATM : "+ ref.getMoney());
        ref.withdraw();
    }
}
