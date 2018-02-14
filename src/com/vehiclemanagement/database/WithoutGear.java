package com.vehiclemanagement.database;

import com.vehiclemanagement.dao.IWithoutGear;

public class WithoutGear extends GearVehicle implements IWithoutGear {

	int quantity;

	@Override
	public void setOilQuantity(int quantity) {
		// TODO Auto-generated method stub
		this.quantity = quantity;
	}

	@Override
	public int getOilQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

}
