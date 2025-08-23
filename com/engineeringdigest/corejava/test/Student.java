package com.engineeringdigest.corejava.test;

public class Student{
    // properties/fields/instance variable and behaviours

    String name;   //This is an INSTANCE VARIABLE as it is declared directly inside the class and outside any function. Is class se juda hai
    int rollNumber;
    private int age;

    public void setAge(int age){
        if(age < 0)
            age=0;

        this.age = age;
    }

    public int getAge(){
        return age; //return this.age; same as there is no conflict here
    }
    public static void main(String[] args){
        // String name; //Local variable means, the scope of this variable is only inside this function.
    }
}