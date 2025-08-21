package OOPS;

public class Test {
    public static void main(String[] args){
        //feild or data or variable
        Car car = new Car();
        // car.color = "Blue";
        // car.speed = 40;
        // car.brand = "Tata";
        // car.year = 2025;
        // car.model = "Safari";

        car.setSpeed(40);

        //behaviours or methods
        car.accelerate(1);
        System.out.println(car.getSpeed());
    }
}
