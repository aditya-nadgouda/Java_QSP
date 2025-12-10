package com.oopsBasics;

public class P07_IIB {

    int a = 10;
    int b= 32;

    static int c = 98;
    static int d =40;

    {

        System.out.println(this);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        a = 7;
        b=77;
        c = 777;
        d = 7777;
    }
    public static void main(String[] args) {

        int e = 50;
        int f = 60;

        P07_IIB ref = new P07_IIB();

        System.out.println(ref);
        System.out.println(ref.a);
        System.out.println(ref.b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);





    }
}
