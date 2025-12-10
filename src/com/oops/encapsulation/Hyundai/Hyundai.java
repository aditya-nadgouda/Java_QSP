package com.oops.encapsulation.Hyundai;

public class Hyundai {

    String clr = "red";
    double price = 1200000;

    public void accelerator (){
        System.out.println("Speed will increase");
    }
}
class Car {

    public static void main(String[] args) {
        Hyundai ref = new Hyundai();
        System.out.println("Color : "+ ref.clr);
        System.out.println("Price : "+ ref.price);

        ref.accelerator();
    }
}
