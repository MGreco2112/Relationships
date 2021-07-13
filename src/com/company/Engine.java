package com.company;

public class Engine {
    public String type;
    boolean isOn = false;
    int fuel;

    public Engine(String type, int fuel) {
        this.type = type;
        this.fuel = fuel;
    }


    public String togglePower() {
        if (isOn) {
            isOn = false;
            return "Powering Off";
        } else {
            isOn = true;
            return "Powering on";
        }
    }
}

/*
Engine Class

Fields:
type
isOn
fuel

Methods:
constructor
togglePower
*/