package com.vehiclemanagement.ui.console;

import java.sql.ResultSet;
import com.vehiclemanagement.objects.LightMotorVehicle;

public interface ILMVDetails extends IVehicleDetails{
	public LightMotorVehicle getVehicleDetails();
	public void printResultSet(ResultSet result);
    public void viewVehicleDetails();
    public void insertVehicleDetails(LightMotorVehicle fourWheeler);
    public void updateVehicleDetails(LightMotorVehicle fourWheeler);
    public void deleteVehicleDetails(LightMotorVehicle fourWheeler);
}
