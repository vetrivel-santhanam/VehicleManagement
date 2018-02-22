package com.vehiclemanagement.prototype;

public interface ITwoWheeler extends IVehicle{ // scooter or bike
    String getBreakType();// Disk or normal
    void setBreakType(String type);
    boolean isPillionAvailable();
    void setPillionOccupied(boolean isPillionAvailable);
}
