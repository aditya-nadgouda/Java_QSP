package com.oopsBasics;

public class P04 {
    static int age;
    static String name ;
    float height;
    int weight;

    public static void main(String[] args) {

        System.out.println("MB");

        System.out.println(age);
        System.out.println(name);
        P04 ref = new P04();
        System.out.println(ref.height);
        System.out.println(ref.weight);

        age = 22;
        name = "aditya";
        ref.height = 5.9F;
        ref.weight = 73;
        System.out.println(age);
        System.out.println(name);
        System.out.println(ref.height);
        System.out.println(ref.weight);

        System.out.println("ME");
    }

    static {

        System.out.println("SB");

        System.out.println(age);
        System.out.println(name);
        P04 ref =new P04();
        System.out.println(ref.height);
        System.out.println(ref.weight);

        System.out.println("SE");
    }
}
