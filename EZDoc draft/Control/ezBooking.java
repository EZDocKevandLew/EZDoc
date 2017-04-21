//modeled on web-shopping class
package Control;
import java.util.Scanner;
import Model.AppointmentDatabase;
import Model.Customer; 

public class ezBooking {
	Scanner input = new Scanner(System.in);

	public ezBooking() {
	}
	public void Validation(){
		Customer login = new Customer();
		String username = login.getUsername();
		String password = login.getPassword();
		Scanner admin = new Scanner(System.in);
		int count = 0;
		while (count<3){
			System.out.println("username: ");
			String usernameInput = admin.nextLine();
			System.out.println("password: ");
			String passwordInput = admin.nextLine();
			if(usernameInput.equals(username) && passwordInput.equals(password)){
				System.out.println("You are now logged in");
				break;}
			else{
				System.out.println("You entered the wrong password and/or username"); 
				count=count+1; 
			}
			if(count==3)
				System.out.println("Sorry you have exceeded the number of tries. Please try again after few hours");
		}
		System.out.println("\nYou are now logged in!");

		AppointmentDatabase pd = new AppointmentDatabase ();
		String mainMenu = ("What do you want to do?\n"
				+ "Select one of the options below by pressing the respective number.\n" 
				+ "-----------------------\n" 
				+ "|1| I want to browse for regular appointments.\n" 
				+ "|2| I want to browse for special appointments.\n"
				+ "|3| I want to browse for dentists.\n" 
				+ "|4| I am a returning customer and would like to check my orders.\n" 
				+ "|5| I am a Dentist and would like to check my schedule\n" 
				+ "|6| Quit");

		System.out.println(mainMenu);

		String makeSelection = input.next();
		Scanner serviceSelected = new Scanner(System.in); 

		switch (makeSelection) {

		case "1": pd.browseRegular(); 

		String bookRegular = serviceSelected.next();  
		System.out.println("Enter 1, 2 or 3 to add the selected item to your basket");                

		switch (bookRegular) {
		case "1": System.out.println("[Appointment] with Doctor [name] on the [date] has been booked for the next 15 minutes."); break;
		case "2": System.out.println("[Appointment] with Doctor [name] on the [date] has been booked for the next 15 minutes."); break;
		case "3": System.out.println("[Appointment] with Doctor [name] on the [date] has been booked for the next 15 minutes."); break;
		} break;

		case "2": pd.browseSpecials();

		String bookSpecial = serviceSelected.next();
		System.out.println("Enter 1, 2 or 3 to add the selected item to your basket");                

		switch (bookSpecial) {
		case "1": System.out.println("[Appointment] with Doctor [name] on the [date] has been booked for the next 15 minutes."); break;
		case "2": System.out.println("[Appointment] with Doctor [name] on the [date] has been booked for the next 15 minutes."); break;
		} break;
		
		case "3": pd.browseDentists();

		String bookDentist = serviceSelected.next();
		System.out.println("Enter 1, 2 or 3 to add the selected item to your basket");                

		switch (bookDentist) {
		case "1": System.out.println("[Appointment] with Doctor [name] on the [date] has been booked for the next 15 minutes."); break;
		case "2": System.out.println("[Appointment] with Doctor [name] on the [date] has been booked for the next 15 minutes."); break;
		} break;


		}                               
	}
}
