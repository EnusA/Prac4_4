package com.EnusA.prac4_4_2;

/**
 * Created by enusa on 2017/03/26.
 */
//AE
public class Car extends Vehicle{
    private int seating;
    private String bootSpace;
    private boolean rented;

    public Car(String mk, String mdl,String reg,double mil, String clr, int seat, String boot, boolean rnt){
        super(mk, mdl,reg,mil,clr);
        seating = seat;
        bootSpace = boot;
        rented = rnt;
    }

    public void setSeating(int seat){seating = seat;}
    public void setBootSpace(String boot){bootSpace = boot;}
    public void setRented(boolean rnt) {rented = rnt;}

    public int getSeating(){return seating;}
    public String getBootSpace(){return bootSpace;}
    public boolean getRented() {return rented;}
}
