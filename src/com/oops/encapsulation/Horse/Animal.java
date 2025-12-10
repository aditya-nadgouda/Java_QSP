package com.oops.encapsulation.Horse;

public class Animal {

    String clr = "White" ;
    double weight = 100;

    public void run (){
        System.out.println("It can Run");
    }

    public void eat (){
        System.out.println("It can Eat");
    }
}

class Horse {

    public static void main(String[] args) {

        Animal horse = new Animal();

        System.out.println("Color : "+horse.clr);
        System.out.println("Weight : "+horse.weight);

        horse.run();
        horse.eat();
    }
}
