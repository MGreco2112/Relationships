package com.company;

public class Tire {
    public double diameter;
    public double pressure;

    public Tire(double diameter, double pressure) {
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public void fill(int air) {
        pressure += air;
    }
}

/*
Tire Class

Fields:
diameter
pressure

Methods:
constructor
fill
*/