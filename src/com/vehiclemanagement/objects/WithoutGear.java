package com.vehiclemanagement.objects;

import com.vehiclemanagement.prototype.IWithoutGear;

public class WithoutGear extends TwoWheeler implements IWithoutGear {

	int quantity;
	
	public WithoutGear() {
		quantity = 0;
	}
	
	public WithoutGear(Vehicle vehicle) {
		super(vehicle);
		quantity = 0;	   	
	}


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
