package com.vehiclemanagement.ui.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import  com.vehiclemanagement.database.Vehicle; 
import java.util.Scanner;

public class VehicleDetails extends Vehicle {
	private java.sql.Connection con = null;
	private PreparedStatement st = null;
	private ResultSet result = null;
	private com.vehiclemanagement.database.Connection dbInit = new com.vehiclemanagement.database.Connection();
	
	public void getVehicleDetails(){
		System.out.println("Enter vehicle details");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of wheels:");
		setWheels( Integer.parseInt( input.nextLine()));
		System.out.println("Enter company:");
		setCompany(input.nextLine());
		System.out.println("Enter Model:");
		setModel( input.nextLine() );		
		System.out.println("Enter make:");
		setMake( input.nextLine() );
		System.out.println("Enter fuel:");
		setFuel(input.nextLine() );
		System.out.println("Enter OnRoadPrice:");
		setOnRoadPrice( Double.parseDouble(input.nextLine()));		
		System.out.println("Enter Engine Number:");
		setEngineNumber(input.nextLine());
    }
	
    public void viewVehicleDetails(){
    	java.sql.Connection con = (java.sql.Connection) dbInit.createConnection();
    	try {
			st = con.prepareStatement("select * from vehicledetails");
			result = st.executeQuery();
			System.out.println("VEHICLE DETAILS");
			System.out.println("WHEELS	COMPANY		MODEL		MAKE	FUEL	ON ROAD PRICE	ENGINE NUMBER");
			while (result.next()) {
				System.out.print(result.getInt(1));
				System.out.print("	" + result.getString(2));
				System.out.print("	" + result.getString(3));
				System.out.print("	" + result.getString(4));
				System.out.print("	" + result.getString(5));
				System.out.print("	" + result.getDouble(6));
				System.out.print("		" + result.getString(7));	
				System.out.println();
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
    public void insertVehicleDetails() {
       con = dbInit.createConnection();
       try {
		st = con.prepareStatement("insert into vehicledetails values (?,?,?,?,?,?,?)");
		st.setInt(1, getWheels());
		st.setString(2, getCompany());
		st.setString(3, getModel());
		st.setString(4, getMake());
		st.setString(5, getFuel());
		st.setDouble(6, getOnRoadPrice()); 
		st.setString(7, getEngineNumber());
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
    public void updateVehicleDetails() {
        con = dbInit.createConnection();
        try {
 		st = con.prepareStatement("update vehicledetails set Fuel = ? where EngineNumber = ?");
 		st.setString(1, getFuel());
 		st.setString(2, getEngineNumber());
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
    public void deleteVehicleDetails() {
        con = dbInit.createConnection();
 		try {
			st = con.prepareStatement("delete from vehicledetails where  EngineNumber = ?");
	 		
	 		st.setString(1, getEngineNumber());
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
