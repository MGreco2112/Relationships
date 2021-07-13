package com.company;

import java.util.ArrayList;

public class Boat extends Vehicle{
    public String type = "Boat";
    public boolean isWater = true;
    public double maxLoad;
    public double currentLoad;
//    public ArrayList<Passenger> passengers = new ArrayList<>();
    public boolean isFull;

    public Boat(Engine engine,
                int maxPassengers, double maxLoad) {
        super(engine, "Boat", false, true, false, false,  maxPassengers);
        this.maxLoad = maxLoad;
    }

    public void addPassenger( Passenger passenger) {
        isFull = passengers.size() >= maxPassengers || currentLoad >= maxLoad;
        if (!isFull) {
            passengers.add(passenger);
            currentLoad += passenger.weight;
            System.out.println("Added " + passenger);
        } else {
            System.out.println("There is no more room!");
        }
    }

    public void removePassenger(Passenger passenger) {
        if (passengers.size() > 0) {
            passengers.remove(passenger);
            currentLoad -= passenger.weight;
            System.out.println("Removed " + passenger);
        }
    }


}

/*
extended to Boat with engine, type boat, isWater true, passengers, maxLoad,
addPassenger, removePassenger.
*/