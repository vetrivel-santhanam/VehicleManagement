package com.vehiclemanagement.objects;

import com.vehiclemanagement.prototype.ICommercial; 

public class Commercial extends Vehicle implements ICommercial{
	protected double ratePerKm;
	protected String driverID;
	
	@Override
	public double getRatePerKm() {
		return ratePerKm;
	}
	@Override
	public void setRatePerKm(double ratePerKm) {
		this.ratePerKm = ratePerKm;
	}
	@Override
	public String getDriverID() {
		return driverID;
	}
	@Override
	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}
}
