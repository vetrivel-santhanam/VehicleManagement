package com.vehiclemanagement.ui.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.vehiclemanagement.objects.Vehicle;
import com.vehiclemanagement.objects.LightMotorVehicle;

public class LMVDetails extends VehicleDetails implements ILMVDetails {
	private java.sql.Connection con = null;
	private PreparedStatement st = null;
	private com.vehiclemanagement.database.Connection dbInit = new com.vehiclemanagement.database.Connection();
	
	public LMVDetails() {
		
	}
	
	public LightMotorVehicle getVehicleDetails(){
		Vehicle vehicleIn;		
		vehicleIn = super.getVehicleDetails();
		LightMotorVehicle fourWheelerIn = new LightMotorVehicle(vehicleIn);
		System.out.println("Enter Four wheeler details");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter seat count:");
		fourWheelerIn.setSeats(Integer.parseInt(input.nextLine()));
		System.out.println("Enter hatchback or not: false, true");
		fourWheelerIn.setHatchBack(Boolean.parseBoolean(input.nextLine()));
		return fourWheelerIn;
    }
	
	public void printResultSet(ResultSet result) {
		super.printResultSet(result);
		try {
			System.out.print(result.getString(10));
			System.out.print("	" + result.getBoolean(11));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println();
	}
	
    public void viewVehicleDetails(){
    	java.sql.Connection con = (java.sql.Connection) dbInit.createConnection();
    	try {
			st = con.prepareStatement("select * from vehicledetails inner join lmvdetails on vehicledetails.regno where vehicledetails.regno = lmvdetails.lmvregnumber");
			ResultSet result = st.executeQuery();
			System.out.println("LMV DETAILS");
			System.out.println("REG.NUMBER	ENGINE NUMBER	COMPANY	MODEL	MAKE	FUEL	ON ROAD PRICE	WHEELS");
			System.out.println("SEATS    HATCHBACK");
			while (result.next()) {
				printResultSet(result);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void insertVehicleDetails( LightMotorVehicle fourWheeler) {
       super.insertVehicleDetails(fourWheeler);
       con = dbInit.createConnection();
       try {
		st = con.prepareStatement("insert into lmvdetails values (?,?,?)");		
		st.setString(1, fourWheeler.getRegNumber());
		st.setInt(2, fourWheeler.getSeats());
		if (fourWheeler.isHatchBack()) {
			st.setString(3, "true");
		} else {
			st.setString(3, "false");			
		}
		st.execute();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    public void updateVehicleDetails(LightMotorVehicle fourWheeler) {
        con = dbInit.createConnection();
        try {
 		st = con.prepareStatement("update lmvdetails set seats = ? where lmvregnumber = ?");
 		st.setInt(1, fourWheeler.getSeats());
 		st.setString(2, fourWheeler.getRegNumber());
 		st.execute();
 		
 	} catch (SQLException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
        try {
 		con.close();
 	} catch (SQLException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
    	
    }
    public void deleteVehicleDetails(LightMotorVehicle fourWheeler) {
        con = dbInit.createConnection();
 		try {
			st = con.prepareStatement("delete from lmvdetails where  lmvregnumber = ?");	 		
	 		st.setString(1, fourWheeler.getRegNumber());
	 		st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
