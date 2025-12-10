package com.methodsAndFunctions;

import java.util.Scanner;

public class P03_TernaryOperator {
static String outPut;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        String check = a==b ? "Yes" : "No";
//
//        System.out.println(check);


        // even odd
//        int a = in.nextInt();
//        String outPut = a%2==0 ? "even":"Odd";
//
//        // divisible by 4 and 7
//        outPut = a % 4 == 0 && a % 7 ==0 ? "Divisible" : "Not Divisible";

        //largest betn 5 num
        int a = 10;
        int b = 98;
        int c = 5;
        int d = 38;
        int e = 73;

        int max = a>b ? a:b;
        int max1 = max > c ? max: c;
        int max2 = max1 > d ? max1 : d;
        int max3 = max2 > e ? max2 : e;

        System.out.println(max3);



        System.out.println(outPut);


    }
}
