package com.vehiclemanagement.prototype;

public interface IVehicle {
    public void start();
    public void stop();
    public void park();
    public void setWheels(int wheels);
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
	public String getRegNumber();
	public void setRegNumber(String regNumber);
}
