package Constructors;

public class Test {
    public static void main(String[] args){
        Student student = new Student("ajay", 1, 11);
        System.out.println(student.getName());
        System.out.println(student.getRollNo());
        System.out.println(student.getAge());
    }
}
