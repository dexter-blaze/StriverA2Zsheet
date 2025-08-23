package com.engineeringdigest.corejava.test;

public class Test1 {

    public static void main(String[] args){
    Student student = new Student();
    student.name = "Ram";
    // student.age = 25;
    student.setAge(15);

    student.rollNumber = 6;
    System.out.println(student.getAge());
    }
}
