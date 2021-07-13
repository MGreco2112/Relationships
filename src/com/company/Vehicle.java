package com.company;

import java.util.ArrayList;

public class Vehicle {
    public Engine engine;
    public String type;
    public boolean isLand;
    public boolean isWater;
    public boolean isAir;
    public boolean isSpace;
    public int maxPassengers;
    public ArrayList<Passenger> passengers = new ArrayList<>();
    public ArrayList<Tire> tires = new ArrayList<>();
    public boolean isFull;

    public Vehicle(Engine engine, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace,
                   int maxPassengers) {
        this.engine = engine;
        this.type = type;
        this.isLand = isLand;
        this.isWater = isWater;
        this.isAir = isAir;
        this.isSpace = isSpace;
        this.maxPassengers = maxPassengers;

    }

    public Vehicle(Engine engine, int maxPassengers) {
        this.engine = engine;
        this.maxPassengers = maxPassengers;
    }


    public void addPassenger( Passenger passenger) {
        isFull = passengers.size() >= maxPassengers;
        if (!isFull) {
            passengers.add(passenger);
            System.out.println("Added " + passenger);
        } else {
            System.out.println("There is no more room!");
        }
    }

    public void removePassenger(Passenger passenger) {
        if (passengers.size() > 0) {
            passengers.remove(passenger);
            System.out.println("Removed " + passenger);
        }
    }

}



/*
Vehicle Class
(extended to Car with engine, type car, isLand true, passengers, tires,
addTire, removeTire, replaceTire.

extended to Plane with engine, type plane, isAir true, passengers. tires,
isLanding, toggleLanding, removeTire, replaceTire.

extended to Boat with engine, type boat, isWater true, passengers, maxLoad,
addPassenger, removePassenger.)

Fields:
Engine
Type
isLand
isWater
isAir
isSpace
Passengers
maxPassengers (weight based?)

Methods:
constructor
togglePower (engine)
addPassenger
removePassenger
*/