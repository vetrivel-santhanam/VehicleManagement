import java.util.Scanner;

import com.vehiclemanagement.database.Connection;
import com.vehiclemanagement.ui.console.VehicleDetails;

public class MainClass {

	public static void main(String[] args) {
		Connection  dbInit = new Connection();
		System.out.println("Connection is established "+dbInit.createConnection());
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
				vehicleDetails.getVehicleDetails();
				vehicleDetails.insertVehicleDetails();
				vehicleDetails.viewVehicleDetails();
				break;

			case 3:
				vehicleDetails.getVehicleDetails();
				vehicleDetails.updateVehicleDetails();
				vehicleDetails.viewVehicleDetails();
				break;

			case 4:
				vehicleDetails.getVehicleDetails();
				vehicleDetails.deleteVehicleDetails();
				vehicleDetails.viewVehicleDetails();
				break;
			default:
				break;
			}
		} while (option!=5);
	}
}
