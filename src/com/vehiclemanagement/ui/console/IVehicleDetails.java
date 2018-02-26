package com.vehiclemanagement.ui.console;

import java.sql.ResultSet;
import com.vehiclemanagement.objects.Vehicle;

public interface IVehicleDetails {
	public Vehicle getVehicleDetails();
	public void printResultSet(ResultSet result);
	public void viewVehicleDetails();
	public void insertVehicleDetails(Vehicle vehicle);
	public void updateVehicleDetails(Vehicle vehicle);
	public void deleteVehicleDetails(Vehicle vehicle);
}
