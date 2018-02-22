package com.vehiclemanagement.objects;

import com.vehiclemanagement.prototype.ITwoWheeler;

enum option {FALSE, TRUE} // Capital and prev to class defn

public class TwoWheeler extends Vehicle implements ITwoWheeler{
	protected String breakType;
	protected option pillionAvailable;//boolean pillionAvailable;	
	
	public TwoWheeler() {
	   	breakType = "";
	   	pillionAvailable = option.TRUE;
	   	}
	
	public TwoWheeler(Vehicle vehicle) {
		super(vehicle);
	   	breakType = "";
	   	pillionAvailable = option.TRUE;
	}
	
	@Override
	public String getBreakType() {
		// TODO Auto-generated method stub
		return breakType;
	}

	@Override
	public void setBreakType(String type) {
		this.breakType = type;
	}

	@Override
	public boolean isPillionAvailable() {
		// TODO Auto-generated method stub
		return pillionAvailable == option.TRUE;
	}

	@Override
	public void setPillionOccupied(boolean pillionAvailable) {
		// TODO Auto-generated method stub		
		this.pillionAvailable = pillionAvailable?option.TRUE:option.FALSE;
	}
}
