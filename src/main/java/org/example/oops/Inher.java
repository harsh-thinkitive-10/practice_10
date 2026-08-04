package org.example.oops;

public class Inher {

    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.run();

        Bike bike = new Bike();
        bike.start();
        bike.race();

    }
}

class Vehicle{
   public void start(){
       System.out.println("started");
   }
}
class Car extends Vehicle{
    public void run(){
        System.out.println("Car is Running");
    }
}
class Bike extends Vehicle{
    public void race(){
        System.out.println("Bike is racing..");
    }
}
