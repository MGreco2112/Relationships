package com.company;

import java.util.ArrayList;

public class Plane extends Vehicle{
    public String type = "Plane";
    public boolean isAir = true;
//    public ArrayList<Passenger> passengers = new ArrayList<>();
    public boolean isFull = passengers.size() >= maxPassengers;
    public ArrayList<Tire> tires = new ArrayList<>();
    public boolean isLanding = false;

    public Plane(Engine engine,
                 int maxPassengers) {
        super(engine, maxPassengers);
        this.engine = engine;
        for (int i = 0; i < 5; i++){
            tires.add(new Tire(7, 40));
        }
    }

    public String landingChk() {
        if (isLanding) {
            isLanding = false;
            return "Landing gear up!";
        } else {
            isLanding = true;
            return "Landing gear down!";
        }
    }


    public void addTire(Tire tire) {
        if (tires.size() < 6) {
            tires.add(tire);
        } else {
            System.out.println("There are already 6 tires");
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
extended to Plane with engine, type plane, isAir true, passengers. tires,
isLanding, toggleLanding, removeTire, replaceTire.
*/