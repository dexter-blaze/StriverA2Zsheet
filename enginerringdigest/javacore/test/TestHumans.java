package enginerringdigest.javacore.test;

import enginerringdigest.javacore.humans.*;

public class TestHumans {
    public static void main(String[] args){
        // Child child = new Child();
        // child.setName("Ram");
        // child.setAge(8);

        // Parent parent = new Parent();
        // parent.setName("Mukesh");
        // parent.setAge(30);
        
        Child child  = new Child("Ram", 12);
        // System.out.println(child.isHasSuperPowers());
        System.out.println(child.getName());
        child.setAge(12);
        child.childMethod();
    }
}
