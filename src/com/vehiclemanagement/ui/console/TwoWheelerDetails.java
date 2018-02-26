package com.vehiclemanagement.ui.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.vehiclemanagement.objects.Vehicle;
import com.vehiclemanagement.objects.TwoWheeler;

public class TwoWheelerDetails extends VehicleDetails implements ITwoWheelerDetails {
	private java.sql.Connection con = null;
	private PreparedStatement st = null;
	private com.vehiclemanagement.database.Connection dbInit = new com.vehiclemanagement.database.Connection();
	
	public TwoWheelerDetails() {
		
	}
	
/*	public TwoWheelerDetails(TwoWheeler twoWheeler) {
		super(twoWheeler);
		this.twoWheeler = twoWheeler;
	}*/
	
	public TwoWheeler getVehicleDetails(){
		Vehicle vehicleIn;		
		vehicleIn = super.getVehicleDetails();
		TwoWheeler twoWheelerIn = new TwoWheeler(vehicleIn);
		System.out.println("Enter Two wheeler details");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter break type:");
		twoWheelerIn.setBreakType(input.nextLine());
		System.out.println("Enter pillion availability: false, true");
		twoWheelerIn.setPillionOccupied(Boolean.parseBoolean(input.nextLine()));
		return twoWheelerIn;
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
			st = con.prepareStatement("select * from vehicledetails inner join twowheelerdetails on vehicledetails.regno where vehicledetails.regno = twowheelerdetails.regnumber");
			ResultSet result = st.executeQuery();
			System.out.println("TWO WHEELER DETAILS");			
			System.out.println("REG.NUMBER	ENGINE NUMBER	COMPANY	MODEL	MAKE	FUEL	ON ROAD PRICE	WHEELS");
			System.out.println("BREAK TYPE	PILLION");
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
    public void insertVehicleDetails(TwoWheeler twoWheeler) {
       super.insertVehicleDetails(twoWheeler);
       con = dbInit.createConnection();
       try {
		st = con.prepareStatement("insert into twowheelerdetails values (?,?,?)");		
		st.setString(1, twoWheeler.getRegNumber());
		st.setString(2, twoWheeler.getBreakType());
		if (twoWheeler.isPillionAvailable()) {
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
    public void updateVehicleDetails(TwoWheeler twoWheeler) {
        con = dbInit.createConnection();
        try {
 		st = con.prepareStatement("update twowheelerdetails set breaktype = ? where regnumber = ?");
 		st.setString(1, twoWheeler.getBreakType());
 		st.setString(2, twoWheeler.getRegNumber());
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
    public void deleteVehicleDetails(TwoWheeler twoWheeler) {
        con = dbInit.createConnection();
 		try {
			st = con.prepareStatement("delete from twowheelerdetails where  regnumber = ?");	 		
	 		st.setString(1, twoWheeler.getRegNumber());
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
