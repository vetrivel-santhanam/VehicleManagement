package com.vehiclemanagement.dao;

public interface IHeavyMotorVehicle {
       boolean isTrailerAttached();
       void setTrailerAttached(boolean trailerAttached);
       boolean isCargo();
       void setCargo(boolean cargo);
       boolean haveAssistant();
       void setAssistant(boolean assistant);
}
