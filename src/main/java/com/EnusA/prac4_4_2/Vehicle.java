package com.EnusA.prac4_4_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enusa on 2017/03/26.
 */
//AE
public class Vehicle {
    protected String make;
    protected String model;
    protected String regNo;
    protected double mileage;
    protected String colour;

    public Vehicle(){}
    public Vehicle(String mk, String mdl,String reg,double mil, String clr){
        make = mk;
        model = mdl;
        regNo = reg;
        mileage = mil;
        colour = clr;
    }

    public void setMake(String mk){make = mk;}
    public void setModel(String mdl){model = mdl;}
    public void setRegNo(String reg){regNo = reg;}
    public void setMileage(double mil){mileage = mil;}
    public void setColour(String clr){colour = clr;}

    public String getMake(){return make;}
    public String getModel(){return model;}
    public String getRegNo(){return regNo;}
    public double getMileage(){return mileage;}
    public String getColour(){return colour;}


    //GM
    List<Car> rentedCars = new ArrayList();
    List<Bike> rentedBikes = new ArrayList();
    Car car;
    Bike bike;

    //AE
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

}
