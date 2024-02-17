package com.dgmf.d.interfaces.defaultstaticmethod.impl;

import com.dgmf.d.interfaces.defaultstaticmethod.Vehicle;

public class Car implements Vehicle {
    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "The Car is Speeding Up ...";
    }

    @Override
    public String slowDown() {
        return "The Car is Slowing Down ...";
    }
}
