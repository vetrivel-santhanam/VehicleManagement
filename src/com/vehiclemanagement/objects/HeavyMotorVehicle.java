package com.vehiclemanagement.objects;

import com.vehiclemanagement.prototype.IHeavyMotorVehicle;

public class HeavyMotorVehicle extends Vehicle implements IHeavyMotorVehicle {
	protected option trailerAttached;
	protected option cargo;
	protected option assistant;
		
	public HeavyMotorVehicle() {
		trailerAttached = option.TRUE;
		cargo = option.FALSE;
		assistant = option.TRUE; 
	}

	public HeavyMotorVehicle(Vehicle vehicle) {
		super(vehicle);
		trailerAttached = option.TRUE;
		cargo = option.FALSE;
		assistant = option.TRUE; 
	}

	
	@Override
	public boolean isTrailerAttached() {
		// TODO Auto-generated method stub
		return trailerAttached == option.TRUE;
	}

	@Override
	public void setTrailerAttached(boolean trailerAttached) {
		// TODO Auto-generated method stub
		this.trailerAttached = trailerAttached?option.TRUE:option.FALSE;
	}

	@Override
	public boolean isCargo() {
		// TODO Auto-generated method stub
		return cargo == option.TRUE;
	}

	@Override
	public void setCargo(boolean cargo) {
		// TODO Auto-generated method stub
		this.cargo = cargo?option.TRUE:option.FALSE;
	}

	@Override
	public boolean haveAssistant() {
		// TODO Auto-generated method stub
		return assistant==option.TRUE;
	}

	@Override
	public void setAssistant(boolean assistant) {
		// TODO Auto-generated method stub
		this.assistant = assistant?option.TRUE:option.FALSE;
	}
}
