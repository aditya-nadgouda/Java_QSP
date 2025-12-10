package com.oopsBasics;

public class P09_Student {

    int studId;
    String studName;
    float studPer;
    P09_Student(){
        //No FA Constructor
    }
    P09_Student(int studId){
        this.studId= studId;
    }
    P09_Student(int id , String name){
        this.studId= id;
        this.studName= name;
    }
    P09_Student(int id, String name, float per){
        this.studId= id;
        this.studName=name;
        this.studPer=per;
    }

    public static void main(String[] args) {

        P09_Student student1 = new P09_Student();
        System.out.println("Student ID : "+student1.studId);
        System.out.println("Student Name : "+ student1.studName);
        System.out.println("Student Percentage : "+student1.studPer);

        P09_Student student2 = new P09_Student(101);
        System.out.println("Student ID : "+student2.studId);
        System.out.println("Student Name : "+ student2.studName);
        System.out.println("Student Percentage : "+student2.studPer);

        P09_Student student3 = new P09_Student(201,"Aditya");
        System.out.println("Student ID : "+student3.studId);
        System.out.println("Student Name : "+ student3.studName);
        System.out.println("Student Percentage : "+student3.studPer);

        P09_Student student4 = new P09_Student(801,"Sushant", 98.99F);
        System.out.println("Student ID : "+student4.studId);
        System.out.println("Student Name : "+ student4.studName);
        System.out.println("Student Percentage : "+student4.studPer);

    }
}
