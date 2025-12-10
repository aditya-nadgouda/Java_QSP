package com.basics;

// class variables : static variables
// instance variable : Non-static variable

public class P01_Variables {
    int instanceVar ; // instance variable // have default value

    static int classVar ; // class variable - static

    public void method (){
        System.out.println("default = "+instanceVar);
        instanceVar = 30;
        System.out.println(instanceVar);

        System.out.println(classVar);
    }

    public static void main(String[] args) {
        P01_Variables obj = new P01_Variables();

        obj.method();


    }
}
