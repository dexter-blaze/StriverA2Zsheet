package com.engineeringdigest.corejava.test;
import com.engineeringdigest.corejava.animals.Dog;
import com.engineeringdigest.corejava.vehicles.Cycle;

public class Test {
    public static void main(String[] args){
        Dog d = new Dog();
        d.makeSound();

        Cycle cycle = new Cycle();
        Cycle.Minicycle minicycle1 = cycle.new Minicycle();

    }
}
