package com.dgmf.d.interfaces.defaultstaticmethods;

public interface Vehicle {
    String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlarmOn() {
        return "Turning Vehicle Alarm On ...";
    }
    default String turnAlarmOff() {
        return "Turning Vehicle Alarm Off ...";
    }
    static String getCompany() {
        return "BMW France";
    }
}
