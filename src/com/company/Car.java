package com.company;

import java.util.ArrayList;

public class Car extends Vehicle{
    public String type = "Car";
//    public ArrayList<Passenger> passengers = new ArrayList<>();
    public ArrayList<Tire> tires = new ArrayList<>();


    public Car(Engine engine,
               int maxPassengers) {
        super(engine, maxPassengers);
        this.isLand = true;
        for (int i = 0; i < 3; i++){
            tires.add(new Tire(7, 40));
        }
    }

    public void addTire(Tire tire) {
        if (tires.size() < 4) {
            tires.add(tire);
        } else {
            System.out.println("There are already 4 tires");
        }
    }

    public void removeTire() {
        tires.remove(0);
    }

    public void replaceTire(Tire tire, int i) {
        tires.remove(i);
        tires.add(tire);
    }

}

/*
extended to Car with engine, type car, isLand true, passengers, tires,
addTire, removeTire, replaceTire.
*/