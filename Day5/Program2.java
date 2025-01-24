class Vehicle{
    short speed;
}

class Bike extends Vehicle{
    Bike(){
        speed = 100;
    }
}

class Car extends Vehicle{
    Car(){
        speed = 150;
    }
}

public class Program2{
    public static void main(String[] args){
        Bike bikeSpeed = new Bike();
        Car carSpeed = new Car();

        System.out.println("Speed of bike is "+ bikeSpeed.speed);
        System.out.println("Speed of car is "+ carSpeed.speed);
    }
}
