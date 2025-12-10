package com.oopsBasics;

public class P10_Student {
    int id ;
    String name;
    double per;
    P10_Student(){
        System.out.println("No Arg Constructor");
    }
    P10_Student (int id){
        this();
        this.id=id;
        System.out.println("1FA constructor");
    }
    P10_Student(int id, String name){
        this(id);
        this.name=name;
        System.out.println("2FA constructor");
    }
    P10_Student(int id, String name, double per){
        this(id,name);
        this.per=per;

        System.out.println("3FA constructor");
    }

    public static void main(String[] args) {
        P10_Student student = new P10_Student(101,"Sushant",98.87);
        System.out.println("Student ID : "+student.id);
        System.out.println("Student Name : "+student.name);
        System.out.println("Student per : "+ student.per);
    }
}
