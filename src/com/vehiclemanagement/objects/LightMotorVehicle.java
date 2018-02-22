package com.vehiclemanagement.objects;

import com.vehiclemanagement.prototype.ILightMotorVehicle;

public class LightMotorVehicle extends Vehicle implements ILightMotorVehicle {
	protected int seats;
	protected boolean hatchBack;
	@Override
	public int getSeats() {
		// TODO Auto-generated method stub
		return seats;
	}
	@Override
	public void setSeats(int seats) {
		// TODO Auto-generated method stub
		this.seats = seats;
	}
	@Override
	public boolean isHatchBack() {
		// TODO Auto-generated method stub
		return hatchBack;
	}
	@Override
	public void setHatchBack(boolean hatchBack) {
		// TODO Auto-generated method stub
		this.hatchBack = hatchBack;
	}
	
}