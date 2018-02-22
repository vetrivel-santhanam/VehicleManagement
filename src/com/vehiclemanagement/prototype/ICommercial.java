package com.vehiclemanagement.prototype;

public interface ICommercial extends IVehicle{    
    public double getRatePerKm();    
	public void setRatePerKm(double ratePerKm);	
	public String getDriverID();	
	public void setDriverID(String driverID);
}
