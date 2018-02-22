package com.vehiclemanagement.objects;

import com.vehiclemanagement.prototype.IVehicle;

public class Vehicle implements IVehicle{
	protected String regNumber; // PK
	protected String engineNumber; // PK        
    protected String company;
    protected String model;
    protected String make;
    protected String fuel;
    protected double onRoadPrice;
    protected int wheels;
    
    public Vehicle() {
    	regNumber = "";
    	engineNumber = "";    	
    	company = "";
    	model = "";
    	make = "";
    	fuel = "";
    	onRoadPrice = 0.0;
    	wheels = 0;
    }
    
    public Vehicle(Vehicle vehicle) {
    	regNumber = vehicle.regNumber;
    	engineNumber = vehicle.engineNumber;    	
    	company = vehicle.company;
    	model = vehicle.model;
    	make = vehicle.make;
    	fuel = vehicle.fuel;
    	onRoadPrice = vehicle.onRoadPrice;
    	wheels = vehicle.wheels;
    }
    
    
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void park() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setWheels(int wheels) {
		this.wheels = wheels;	
	}
	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return company;
	}
	@Override
	public void setCompany(String company) {
		this.company = company;
		
	}
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	@Override
	public void setModel(String model) {
		this.model = model;		
	}
	@Override
	public String getMake() {
		// TODO Auto-generated method stub
		return make;
	}
	@Override
	public void setMake(String make) {
		this.make = make;		
	}
	@Override
	public String getFuel() {
		
		return fuel;
	}
	@Override
	public void setFuel(String fuel) {
		this.fuel = fuel;
		
	}
	@Override
	public double getOnRoadPrice() {
		
		return onRoadPrice;
	}
	@Override
	public void setOnRoadPrice(double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
		
	}
	@Override
	public String getEngineNumber() {
		// TODO Auto-generated method stub
		return engineNumber;
	}
	@Override
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;		
	}
	
	@Override
	public String getRegNumber() {
		// TODO Auto-generated method stub
		return regNumber;
	}
	@Override
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;		
	}
}
