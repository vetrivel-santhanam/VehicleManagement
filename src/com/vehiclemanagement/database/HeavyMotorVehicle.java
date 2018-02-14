package com.vehiclemanagement.database;

import com.vehiclemanagement.dao.IHeavyMotorVehicle;

public class HeavyMotorVehicle extends Vehicle implements IHeavyMotorVehicle {
	protected boolean trailerAttached;
	protected boolean cargo;
	protected boolean assistant;
	
	@Override
	public boolean isTrailerAttached() {
		// TODO Auto-generated method stub
		return trailerAttached;
	}

	@Override
	public void setTrailerAttached(boolean trailerAttached) {
		// TODO Auto-generated method stub
		this.trailerAttached = trailerAttached;
	}

	@Override
	public boolean isCargo() {
		// TODO Auto-generated method stub
		return cargo;
	}

	@Override
	public void setCargo(boolean cargo) {
		// TODO Auto-generated method stub
		this.cargo = cargo;
	}

	@Override
	public boolean haveAssistant() {
		// TODO Auto-generated method stub
		return assistant;
	}

	@Override
	public void setAssistant(boolean assistant) {
		// TODO Auto-generated method stub
		this.assistant = assistant;
	}
}
