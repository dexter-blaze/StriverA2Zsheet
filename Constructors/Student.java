package Constructors;

public class Student {
    private String name;

    private int rollNo;

    private int age;

    //Overloaded constructor - if we haven't created this constructor, default value of age have been set.
    // public Student(){
    //     this.age=10;
    

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    //Parameterized constructor -  to initialize custom value of object's instances while object creation
    public Student(String name, int rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    //Constructor overloading:
    public Student(String name){
        this.name = name;
    }

    public Student(int rollNo){
        this.rollNo = rollNo;
    }

}
