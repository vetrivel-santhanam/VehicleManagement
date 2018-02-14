package com.vehiclemanagement.database;

import com.vehiclemanagement.dao.IWithGear;

public class WithGear extends GearVehicle implements IWithGear{
	int currentGear;
	
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
