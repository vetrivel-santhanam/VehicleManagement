package com.vehiclemanagement.dao;

public interface IGearVehicle extends IVehicle{ // scooter or bike
    String getBreakType();// Disk or normal
    void setBreakType(String type);
    boolean isPillionAvailable();
    void setPillionOccupied(boolean isPillionAvailable);
    void setGearType(String gearType);// manual or auto
    String getGearType();
    //void setSpeed(int speed);
    //int getSpeed();
}
