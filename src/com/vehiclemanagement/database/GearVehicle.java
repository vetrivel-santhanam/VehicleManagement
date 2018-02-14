package com.vehiclemanagement.database;

import com.vehiclemanagement.dao.IGearVehicle;

public class GearVehicle extends Vehicle implements IGearVehicle{
	protected String breakType;
	protected boolean pillionAvailable;	
	protected String gearType;
	//protected int speed;
	
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
		return pillionAvailable;
	}

	@Override
	public void setPillionOccupied(boolean pillionAvailable) {
		// TODO Auto-generated method stub
		this.pillionAvailable = pillionAvailable;
	}

	@Override
	public void setGearType(String gearType) {
		// TODO Auto-generated method stub
		this.gearType = gearType;
	}

	@Override
	public String getGearType() {
		// TODO Auto-generated method stub
		return gearType;
	}

	/*@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}*/

}
