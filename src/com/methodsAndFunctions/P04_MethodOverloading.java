package com.methodsAndFunctions;

public class P04_MethodOverloading {

    public static int smallest (int a , int b){
        return a<b ? a : b;
    }

    public static int smallest (int a, int b , int c){
        int smallest = a;
        if (b < smallest){
            smallest = b;
        }
        else if (c < smallest){
            smallest = c;
        }
        return smallest;
    }

    public static int smallest (int a , int b, int c , int d){

        int smallest = a < b ? a : b;
        smallest= smallest < c ? smallest : c;
        smallest = smallest < d ? smallest : d;

        return smallest;
    }
    public static void main(String[] args) {

       int smallestOfTwo =  smallest(10,20);
       int smallestOfThree = smallest(10,30,11);
       int smallestOfFour =  smallest(1,5,7,2);

        System.out.println(smallestOfTwo);
        System.out.println(smallestOfThree);
        System.out.println(smallestOfFour);

    }
}
