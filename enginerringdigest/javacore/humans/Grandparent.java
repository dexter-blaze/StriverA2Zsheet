package enginerringdigest.javacore.humans;

public class Grandparent {

    private int age;
    private String name;

    private boolean hasSuperPowers;


    public Grandparent(String name, int age){
        this.name = name;
        this.age = age;

        hasSuperPowers = true;
        System.out.println("Grandparent constructor called!");
    }

    
    public boolean isHasSuperPowers() {
        return hasSuperPowers;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
