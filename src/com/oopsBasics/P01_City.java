package com.oopsBasics;

public class P01_City {

    static String city = "India";

    public static void method(){

        String city = "Maharashtra";

        System.out.println("Local CITY : "+city);
        System.out.println("Global CITY: "+ P01_City.city);

        System.out.println("Reinitialization ");

        city = "Pune";
        P01_City.city="Bharat";

        System.out.println("Local CITY : "+city);
        System.out.println("Global CITY : "+ P01_City.city);

    }

    public static void main(String[] args) {
        method();

    }
}
