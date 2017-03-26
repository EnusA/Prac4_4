package com.EnusA.prac4_4_2;


import java.util.ArrayList;
import java.util.List;

public class App
{
    //GM
    List<Car> rentedCars = new ArrayList();
    List<Bike> rentedBikes = new ArrayList();
    Car car;
    Bike bike;

    public String rentBike()
    {
        bike = new Bike("Suzuki","Bandit","CA20156",2017,
                "Black","No","Yes",true);
        rentedBikes.add(bike);

        return ("Bike rented: \nMake: " + bike.make + "\nRegistration number: " + bike.regNo);
    }

    //GM
    public String rentCar()
    {
        car = new Car("Chevrolet", "Spark", "CA85246", 23084,
                "Blue", 4, "Small", true);
        rentedCars.add(car);

        return ("Car rented: \nMake: " + car.make + "\nRegistration number: " + car.regNo);
    }

    public static void main( String[] args )
    {
        App ap = new App();

        System.out.println(ap.rentBike());
        System.out.println(ap.rentCar());
    }
}
