package com.company;

public class Main {
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
togglePower
addPassenger
removePassenger

Engine Class

Fields:
type
isOn
fuel

Methods:
constructor
togglePower

Tire Class

Fields:
diameter
pressure

Methods:
constructor
fill

Passenger Class

Fields:
name
weight

Methods:
constructor

*/


    public static void main(String[] args) {
        Engine gas = new Engine("Gas", 5000);
        Engine electric = new Engine("Electric", 5000);

        Car rocinante = new Car(gas, 5);
        Boat batBoat = new Boat(electric, 5, 200);
        Plane tetsuo = new Plane(gas, 50);

        Passenger matt = new Passenger("Matt", 139);
        Passenger landon = new Passenger("Landon", 150);
        Passenger sergio = new Passenger("Sergio", 190);

        rocinante.addPassenger(matt);
        batBoat.addPassenger(landon);
        tetsuo.addPassenger(sergio);

    }
}
