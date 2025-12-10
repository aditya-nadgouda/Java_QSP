package com.oopsBasics;

public class P08_Constructors {

    P08_Constructors(){
        System.out.println("No arg constructor");
    }

    P08_Constructors(int a){
        System.out.println("1FA Constructor");
    }

    P08_Constructors(int a, int b ){
        System.out.println("2FA Constructor");
    }

    P08_Constructors(int a, String b ){
        System.out.println("2FA-A Constructor");
    }

    P08_Constructors(char c , int b ){
        System.out.println("2FA-B Constructor");
    }

    public static void main(String[] args) {

        new P08_Constructors();
        new P08_Constructors(10);
        new P08_Constructors(1,2);
        new P08_Constructors(2, "pp");
        new P08_Constructors('c',9);
    }
}
