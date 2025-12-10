package com.oopsBasics;

public class P05_NonStaticMethod {
    static  int a=10;
    int b = 20;
    public void method (){
        System.out.println("Meth B");
        System.out.println(b);
        System.out.println(this.b);
        System.out.println(a);

        System.out.println("Meth E");
    }

    public static void main(String[] args) {

        System.out.println("MB");
        System.out.println(a);
        P05_NonStaticMethod ref = new P05_NonStaticMethod();
        System.out.println(ref.b);
        ref.method();

        System.out.println("ME");
    }
}
