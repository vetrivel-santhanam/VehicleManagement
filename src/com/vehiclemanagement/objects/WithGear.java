package com.vehiclemanagement.objects;

import com.vehiclemanagement.prototype.IWithGear;

public class WithGear extends TwoWheeler implements IWithGear{
	int currentGear;
	
	public WithGear() {
		currentGear = 0;
	}
	
	public WithGear(Vehicle vehicle) {
		super(vehicle);
		currentGear = 0;	   	
	}

	
	@Override
	public int getCurrentGear() {
		// TODO Auto-generated method stub
		return currentGear;
	}

	@Override
	public void setCurrentGear(int gear) {
		// TODO Auto-generated method stub
		this.currentGear = gear;
	}
}
