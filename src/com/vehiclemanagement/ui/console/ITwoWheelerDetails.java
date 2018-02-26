package com.vehiclemanagement.ui.console;

import java.sql.ResultSet;

import com.vehiclemanagement.objects.TwoWheeler;

public interface ITwoWheelerDetails extends IVehicleDetails{
	public TwoWheeler getVehicleDetails();
	public void printResultSet(ResultSet result);
    public void viewVehicleDetails();
    public void insertVehicleDetails(TwoWheeler twoWheeler);
    public void updateVehicleDetails(TwoWheeler twoWheeler);
    public void deleteVehicleDetails(TwoWheeler twoWheeler);
}
