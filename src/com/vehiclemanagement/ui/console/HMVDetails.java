package com.vehiclemanagement.ui.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.vehiclemanagement.objects.Vehicle;
import com.vehiclemanagement.objects.HeavyMotorVehicle;

public class HMVDetails extends VehicleDetails implements IHMVDetails {
	private java.sql.Connection con = null;
	private PreparedStatement st = null;
	private com.vehiclemanagement.database.Connection dbInit = new com.vehiclemanagement.database.Connection();
	
	public HMVDetails() {
		
	}
	
	public HeavyMotorVehicle getVehicleDetails(){
		Vehicle vehicleIn;		
		vehicleIn = super.getVehicleDetails();
		HeavyMotorVehicle fourWheelerIn = new HeavyMotorVehicle(vehicleIn);
		System.out.println("Enter Four wheeler(HMV) details");
		Scanner input = new Scanner(System.in);
		System.out.println("Trailor attached? (true or false)");
		fourWheelerIn.setTrailerAttached(Boolean.parseBoolean(input.nextLine()));
		System.out.println("Cargo ?(true or false)");
		fourWheelerIn.setCargo(Boolean.parseBoolean(input.nextLine()));
		System.out.println("Assistant ?(true or false)");
		fourWheelerIn.setAssistant(Boolean.parseBoolean(input.nextLine()));
		return fourWheelerIn;
    }
	
	public void printResultSet(ResultSet result) {
		super.printResultSet(result);
		try {
			System.out.print(result.getBoolean(10));
			System.out.print("	" + result.getBoolean(11));
			System.out.print("	" + result.getBoolean(12));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println();
	}
	
    public void viewVehicleDetails(){
    	java.sql.Connection con = (java.sql.Connection) dbInit.createConnection();
    	try {
			st = con.prepareStatement("select * from vehicledetails inner join hmvdetails on vehicledetails.regno where vehicledetails.regno = hmvdetails.hmvregnumber");
			ResultSet result = st.executeQuery();
			System.out.println("HMV DETAILS");
			System.out.println("REG.NUMBER	ENGINE NUMBER	COMPANY	MODEL	MAKE	FUEL	ON ROAD PRICE	WHEELS");
			System.out.println("TRAILOR	CARGO	ASSISTANT");
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
    public void insertVehicleDetails( HeavyMotorVehicle fourWheeler) {
       super.insertVehicleDetails(fourWheeler);
       con = dbInit.createConnection();
       try {
		st = con.prepareStatement("insert into hmvdetails values (?,?,?,?)");		
		st.setString(1, fourWheeler.getRegNumber());
		if (fourWheeler.isTrailerAttached()) {
			st.setString(2, "true");
		} else {
			st.setString(2, "false");			
		}		
		if (fourWheeler.isCargo()) {
			st.setString(3, "true");			
		} else {
			st.setString(3, "false");			
		}
		if (fourWheeler.haveAssistant()) {
			st.setString(4, "true");			
		} else {
			st.setString(4, "false");			
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
    public void updateVehicleDetails( HeavyMotorVehicle fourWheeler) {
        con = dbInit.createConnection();
        try {
 		st = con.prepareStatement("update hmvdetails set cargo = ? where hmvregnumber = ?");
 		if (fourWheeler.isCargo()) {
 			st.setString(1, "true"); 
 		} else {
 			st.setString(1, "false");
 		} 		 		
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
    public void deleteVehicleDetails( HeavyMotorVehicle fourWheeler) {
        con = dbInit.createConnection();
 		try {
			st = con.prepareStatement("delete from hmvdetails where  hmvregnumber = ?");	 		
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
