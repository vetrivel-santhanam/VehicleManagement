import java.util.Scanner;

import com.vehiclemanagement.database.Connection;
import com.vehiclemanagement.ui.console.TwoWheelerDetails;
import com.vehiclemanagement.ui.console.LMVDetails;
import com.vehiclemanagement.ui.console.HMVDetails;
import com.vehiclemanagement.ui.console.VehicleDetails;
import com.vehiclemanagement.objects.LightMotorVehicle;
import com.vehiclemanagement.objects.HeavyMotorVehicle;
import com.vehiclemanagement.objects.TwoWheeler;
import com.vehiclemanagement.objects.Vehicle;

public class MainClass {

	public static void main(String[] args) {
		//Connection  dbInit = new Connection();
		//System.out.println("Connection is established "+dbInit.createConnection());
		
		//mainVehicleDetails();
		//mainTwoWheelerDetails();
		//mainLMVDetails();
		mainHMVDetails();
	}
		
	public static void mainVehicleDetails() {
        VehicleDetails vehicleDetails = new VehicleDetails();
        int option = 0;
        do {			
			System.out.println("=================MENU==============");
			System.out.println("1. View Vehicle Details");
			System.out.println("2. Insert Vehicle Details");
			System.out.println("3. Update Vehicle Details");
			System.out.println("4. Delete Vehicle Details");
			System.out.println("5. Quit");
			System.out.println("Enter the Option: ");
			Scanner input = new Scanner(System.in);
			option = input.nextInt();
			switch (option) {
			case 1:
				vehicleDetails.viewVehicleDetails();
				break;

			case 2:
			{
				Vehicle vehicle = vehicleDetails.getVehicleDetails();
				vehicleDetails.insertVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;
			

			case 3:
			{
				Vehicle vehicle = vehicleDetails.getVehicleDetails();
				vehicleDetails.updateVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;

			case 4:
				Vehicle vehicle = vehicleDetails.getVehicleDetails();
				vehicleDetails.deleteVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
				break;
			default:
				break;
			}
		} while (option!=5);
	}
	
	public static void mainTwoWheelerDetails() {
		TwoWheelerDetails vehicleDetails = new TwoWheelerDetails();
        int option = 0;
        do {			
			System.out.println("=================MENU==============");
			System.out.println("1. View TwoWheeler Details");
			System.out.println("2. Insert TwoWheeler Details");
			System.out.println("3. Update TwoWheeler Details");
			System.out.println("4. Delete TwoWheeler Details");
			System.out.println("5. Quit");
			System.out.println("Enter the Option: ");
			Scanner input = new Scanner(System.in);
			option = input.nextInt();
			switch (option) {
			case 1: // View
				vehicleDetails.viewVehicleDetails();
				break;

			case 2: // Insert
			{
				TwoWheeler vehicle = vehicleDetails.getVehicleDetails();						
				vehicleDetails.insertVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;

			case 3: // Update
			{
				TwoWheeler vehicle = vehicleDetails.getVehicleDetails();
				vehicleDetails.updateVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;

			case 4: // Delete
			{
				TwoWheeler vehicle = vehicleDetails.getVehicleDetails();				
				vehicleDetails.deleteVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;
			default:
				break;
			}
		} while (option!=5);
	}	
	public static void mainLMVDetails() {
		LMVDetails vehicleDetails = new LMVDetails();
        int option = 0;
        do {			
			System.out.println("=================MENU==============");
			System.out.println("1. View LMV Details");
			System.out.println("2. Insert LMV Details");
			System.out.println("3. Update LMV Details");
			System.out.println("4. Delete LMV Details");
			System.out.println("5. Quit");
			System.out.println("Enter the Option: ");
			Scanner input = new Scanner(System.in);
			option = input.nextInt();
			switch (option) {
			case 1: // View
				vehicleDetails.viewVehicleDetails();
				break;

			case 2: // Insert
			{
				LightMotorVehicle vehicle = vehicleDetails.getVehicleDetails();						
				vehicleDetails.insertVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;

			case 3: // Update
			{
				LightMotorVehicle vehicle = vehicleDetails.getVehicleDetails();
				vehicleDetails.updateVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;

			case 4: // Delete
			{
				LightMotorVehicle vehicle = vehicleDetails.getVehicleDetails();				
				vehicleDetails.deleteVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;
			default:
				break;
			}
		} while (option!=5);
	}	
	public static void mainHMVDetails() {
		HMVDetails vehicleDetails = new HMVDetails();
        int option = 0;
        do {			
			System.out.println("=================MENU==============");
			System.out.println("1. View HMV Details");
			System.out.println("2. Insert HMV Details");
			System.out.println("3. Update HMV Details");
			System.out.println("4. Delete HMV Details");
			System.out.println("5. Quit");
			System.out.println("Enter the Option: ");
			Scanner input = new Scanner(System.in);
			option = input.nextInt();
			switch (option) {
			case 1: // View
				vehicleDetails.viewVehicleDetails();
				break;

			case 2: // Insert
			{
				HeavyMotorVehicle vehicle = vehicleDetails.getVehicleDetails();						
				vehicleDetails.insertVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;

			case 3: // Update
			{
				HeavyMotorVehicle vehicle = vehicleDetails.getVehicleDetails();
				vehicleDetails.updateVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;

			case 4: // Delete
			{
				HeavyMotorVehicle vehicle = vehicleDetails.getVehicleDetails();				
				vehicleDetails.deleteVehicleDetails(vehicle);
				vehicleDetails.viewVehicleDetails();
			}
				break;
			default:
				break;
			}
		} while (option!=5);
	}	

}
