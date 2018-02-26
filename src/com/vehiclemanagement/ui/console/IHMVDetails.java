package com.vehiclemanagement.ui.console;

import java.sql.ResultSet;
import com.vehiclemanagement.objects.HeavyMotorVehicle;

public interface IHMVDetails extends IVehicleDetails{
	public HeavyMotorVehicle getVehicleDetails();
	public void printResultSet(ResultSet result);
    public void viewVehicleDetails();
    public void insertVehicleDetails(HeavyMotorVehicle hmv);
    public void updateVehicleDetails(HeavyMotorVehicle hmv);
    public void deleteVehicleDetails(HeavyMotorVehicle hmv);
}
