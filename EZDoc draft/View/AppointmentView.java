package View;

import java.util.Scanner;
import.model.Appointments
import.model.TypeRegular
import.model.TypeSpecial


public class AppointmentView {
	
	public AppointmentView(){

}
	
public Appointments getAppointmentDetails(){
	Scanner input = new Scanner(System.in);
	String details;
	TypeRegular R = new TypeRegular();
	TypeSpecial S = new TypeSpecial()
	System.out.print("Enter your first name: ");
	details = input.nextLine();
	C.setFirstName(details);
	System.out.print("Enter your last name: ");
	details = input.nextLine();
	C.setLastName(details);
	
//Similar to CustomerView
package View;

import java.util.Scanner;
import Model.Customer;

public class AppointmentView {
	
public AppointmentView(){
	
}

public Appointment getAppointmentDetails(){
	Scanner input = new Scanner(System.in);
	String details;
	Appointments A = new Appointments();
	System.out.print("Enter the type of appointment; Regular or Special? ");
	details = input.nextLine();
	A.setType(details);
	//consider adding a check for this
	System.out.print("Enter the name of the service: ");
	details = input.nextLine();
	A.setName(details);
	
	System.out.println("Enter the price:");
	details = input.nextLine();
		    A.setPrice(details);
		    
	System.out.println("Enter date for this appointment:");
	details = input.nextLine();
      A.setDate(details);	
	
  System.out.print("Enter the name of the doctor: ");
  details = input.nextLine();
	A.setDoctor(details);
	
	//Hereafter follows information to be listed specific to whether 
	//the Dentist set the type as "Special" or "Regular". 
 
	return A;
	
}

public void printAppointmentDetails(Appointments A) {
	System.out.println(A.toString());
}
}






