package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 1999);
        System.out.println(car.displayCar());
        System.out.println(car.isOldCar());
    }
}

