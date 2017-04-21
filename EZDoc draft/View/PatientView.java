package View;

import java.util.Scanner;
import Model.Patient;

public class PatientView {

	public PatientView(){
		
	}
	  
	public  Patient getPatientDetails(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String details;
		Patient C = new Patient();
		System.out.print("Enter your first name: ");
		details = input.nextLine();
		C.setFirstName(details);
		System.out.print("Enter your last name: ");
		details = input.nextLine();
		C.setLastName(details);
		System.out.println("Enter your CPR number(123456-1234):");
		details = input.nextLine();
		if (details.matches("^(\\d{6}-?\\d{4})$")) 
			    C.setCprNumber(details);
		else 
			System.out.println("You have entered an invalid CPR number");
		
		System.out.println("Enter your Telephone Number (8 digits):");
		details = input.nextLine();
		if (details.matches("[0-9]+") && details.length()==8) 
	        C.setTelephone(details);
		else
			System.out.println("Invalid number");
	    System.out.print("Enter your address: ");
	    details = input.nextLine();
		C.setAddress(details);
		C.setUsername();
		C.setPassword();
		
		return C;
		
	}

	public void printPatientDetails(Patient C) {
		// TODO Auto-generated method stub
		System.out.println(C.toString());
	}

	
	}
	


