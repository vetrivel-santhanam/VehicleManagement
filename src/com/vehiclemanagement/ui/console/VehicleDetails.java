package com.vehiclemanagement.ui.console;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.vehiclemanagement.objects.Vehicle;

public class VehicleDetails  implements IVehicleDetails {
	private java.sql.Connection con = null;
	private PreparedStatement st = null;
	private com.vehiclemanagement.database.Connection dbInit = new com.vehiclemanagement.database.Connection();
		
	public VehicleDetails() {
		
	}
/*	public VehicleDetails(Vehicle vehicle) {
		this.vehicle =   vehicle;
	}*/
	
	public Vehicle getVehicleDetails(){
		Vehicle vehicleIn = new Vehicle();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter vehicle details");
		System.out.println("Enter Registration Number:");
		vehicleIn.setRegNumber(input.nextLine());		
		System.out.println("Enter Engine Number:");
		vehicleIn.setEngineNumber(input.nextLine());
		System.out.println("Enter company:");
		vehicleIn.setCompany(input.nextLine());
		System.out.println("Enter Model:");
		vehicleIn.setModel( input.nextLine() );		
		System.out.println("Enter make:");
		vehicleIn.setMake( input.nextLine() );
		System.out.println("Enter fuel:");
		vehicleIn.setFuel(input.nextLine() );
		System.out.println("Enter OnRoadPrice:");
		vehicleIn.setOnRoadPrice( Double.parseDouble(input.nextLine()));		
		System.out.println("Enter number of wheels:");
		vehicleIn.setWheels( Integer.parseInt( input.nextLine()));
		return vehicleIn;
    }
	
	public void printResultSet(ResultSet result) {
		try {
			System.out.print(result.getString(1));
			System.out.print("	" + result.getString(2));
			System.out.print("	" + result.getString(3));
			System.out.print("	" + result.getString(4));
			System.out.print("	" + result.getString(5));
			System.out.print("	" + result.getString(6));
			System.out.print("	" + result.getDouble(7));
			System.out.print("	" + result.getInt(8));			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
	}
	
    public void viewVehicleDetails(){
    	java.sql.Connection con = (java.sql.Connection) dbInit.createConnection();
    	try {
			st = con.prepareStatement("select * from vehicledetails");
			ResultSet result = st.executeQuery();
			System.out.println("VEHICLE DETAILS");
			System.out.println("REG.NUMBER	ENGINE NUMBER	COMPANY	MODEL	MAKE	FUEL	ON ROAD PRICE	WHEELS");
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
    public void insertVehicleDetails(Vehicle vehicle) {
       con = dbInit.createConnection();
       try {
		st = con.prepareStatement("insert into vehicledetails values (?,?,?,?,?,?,?,?)");
		st.setString(1, vehicle.getRegNumber());
		st.setString(2, vehicle.getEngineNumber());
		st.setString(3, vehicle.getCompany());
		st.setString(4, vehicle.getModel());
		st.setString(5, vehicle.getMake());
		st.setString(6, vehicle.getFuel());
		st.setDouble(7, vehicle.getOnRoadPrice());
		st.setInt(8, vehicle.getWheels());		
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
    public void updateVehicleDetails(Vehicle vehicle) {
        con = dbInit.createConnection();
        try {
 		st = con.prepareStatement("update vehicledetails set Fuel = ? where enginenumber = ?");
 		st.setString(1, vehicle.getFuel());
 		st.setString(2, vehicle.getEngineNumber());
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
    public void deleteVehicleDetails(Vehicle vehicle) {
        con = dbInit.createConnection();
 		try {
			st = con.prepareStatement("delete from vehicledetails where  enginenumber = ?");
	 		
	 		st.setString(1, vehicle.getEngineNumber());
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
