package com.vehiclemanagement.dao;

public interface IVehicle {
	
/*	String company;
	String model;
	String make;
	String fuel;
	double onRoadPrice;
	String engineNumber;
*/	
/*	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public double getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
*/	
    public void start();
    public void stop();
    public void park();
    public void setWheels();
    public int getWheels();
    public String getCompany();
    public void setCompany(String company);
	public String getModel();
	public void setModel(String model);
	public String getMake();
	public void setMake(String make);
	public String getFuel();
	public void setFuel(String fuel);
	public double getOnRoadPrice();
	public void setOnRoadPrice(double onRoadPrice);
	public String getEngineNumber();
	public void setEngineNumber(String engineNumber);	
}
