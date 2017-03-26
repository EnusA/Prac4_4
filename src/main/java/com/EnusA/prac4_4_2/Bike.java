package com.EnusA.prac4_4_2;

/**
 * Created by enusa on 2017/03/26.
 */
//GM
public class Bike extends Vehicle {
    private String sideCar;
    private String heatedHandles;
    private boolean rented;

    public Bike(String mk, String mdl, String reg, double mlg, String clr, String sC, String hH, boolean rnt)
    {
        super(mk, mdl, reg, mlg, clr);
        sideCar = sC;
        heatedHandles = hH;
        rented = rnt;
    }

    public void setSideCar(String sC){sideCar = sC;}
    public void setHeatedHandles(String hH){heatedHandles = hH;}
    public void setRented(boolean rnt) {rented = rnt;}

    public String getSideCar(){return sideCar;}
    public String getHeatedHandles(){return heatedHandles;}
    public boolean getRented() {return rented;}
}
