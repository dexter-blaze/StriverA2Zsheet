package OOPS;

public class Car {
    private String color;

    private String brand;

    private String model;

    private int year;

    private int speed;

    public int getSpeed() {
        return speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // public void setModel(String model) {
    //     this.model = model;
    // }
    // public void setYear(int year) {
    //     this.year = year;
    // }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void accelerate(int increment){
        speed += increment;
    }
    public void brake(int decrement){
        speed -= decrement;
    }
}