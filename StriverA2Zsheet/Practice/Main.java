class InstanceVariableDemo{ 
    //Defining Instance Variables 
    public String name;  
    public int age=19;  
 //Creadting a default Constructor initializing Instance Variable  
    public InstanceVariableDemo()  
    {  
        this.name = "Deepak";  
    }  
}  
class Main{  
    public static void main(String[] args)  
    {  
        // Object Creation  
       InstanceVariableDemo obj = new InstanceVariableDemo();  
        System.out.println("Student Name is: " + obj.name);  
        System.out.println("Age: "+ obj.age); 
        
        InstanceVariableDemo obj1 = new InstanceVariableDemo();
        obj1.name = "Pritam";
        obj1.age = 21;
        System.out.println("Student Name is: " + obj1.name);
        System.out.println("Age: "+ obj1.age);
    }  
}  