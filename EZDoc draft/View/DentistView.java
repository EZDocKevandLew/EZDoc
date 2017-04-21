package View;

import java.util.Scanner;
import Model.Dentist;

public class DentistView {


	public Dentist getDentistDetails() {
		
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String details;
			Dentist E = new Dentist();
			details = input.nextLine();
			System.out.print("Please input the address of your practice.");
			E.setAddress(details);
	
			details = input.nextLine();
			System.out.println("Please enter your availability:");
			E.setBookingApp(details);

			return E;
		}

public void printDentistDetails(Dentist E){
	System.out.println(E.toString());
}
}
	
