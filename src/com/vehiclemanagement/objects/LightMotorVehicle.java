package com.vehiclemanagement.objects;

import com.vehiclemanagement.prototype.ILightMotorVehicle;

//enum option {FALSE, TRUE}

public class LightMotorVehicle extends Vehicle implements ILightMotorVehicle {
	protected int seats;
	protected option hatchBack;
	
	public LightMotorVehicle() {
		seats = 4;
		hatchBack = option.FALSE;
	}
	
	public LightMotorVehicle(Vehicle vehicle) {
		super(vehicle);
	   	seats = 0;
	   	hatchBack = option.FALSE;
	}
	
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
		return hatchBack==option.TRUE;
	}
	@Override
	public void setHatchBack(boolean hatchBack) {
		// TODO Auto-generated method stub
		this.hatchBack = hatchBack?option.TRUE:option.FALSE;
	}
	
}