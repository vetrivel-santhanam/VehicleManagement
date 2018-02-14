package com.vehiclemanagement.database;

import com.vehiclemanagement.dao.INonCommercial;

public class NonCommercial extends Vehicle implements INonCommercial {
	
	String ownerName;
	String ownerAddress;
	String ownerID;
	String driverID;

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return ownerName;
	}

	@Override
	public void setOwnerName(String ownerName) {
		// TODO Auto-generated method stub
		this.ownerName = ownerName;		
	}

	@Override
	public String getOwnerAddress() {
		// TODO Auto-generated method stub
		return ownerAddress;
	}

	@Override
	public void setOwnerAddress(String ownerAddress) {
		// TODO Auto-generated method stub
		this.ownerAddress = ownerAddress;
	}

	@Override
	public String getOwnerID() {
		// TODO Auto-generated method stub
		return ownerID;
	}

	@Override
	public void setOwnerID(String ownerID) {
		// TODO Auto-generated method stub
		this.ownerID = ownerID;
	}

	@Override
	public String getDriverID() {
		// TODO Auto-generated method stub
		return driverID;
	}

	@Override
	public void setDriverID(String driverID) {
		// TODO Auto-generated method stub
		this.driverID = driverID;
	}
	

}
