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


}
