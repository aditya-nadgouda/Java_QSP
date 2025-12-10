package com.oopsBasics;

// to execute some statements before main method ;
public class P02_StaticBlock {

    static {

        System.out.println("Static Block");
    }
    public static void main(String[] args) {

        System.out.println("Main method");

    }
}
