package Model;

import Data.ReadAndWrite; 

public class Dentist extends User{
//CHANGE IN TEMP
	String bookingApp; 
//HELLO I'VE MADE A CHANGE
	public Dentist(){
		super();
		bookingApp = "";
	}
	
	public Dentist(String fname, String lname, String address, String username, String password, String bookingApp){
		super (fname, lname, address, username, password);
		this.bookingApp = bookingApp;
	}

	public String getBookingApp() {
		return bookingApp;
	}

	public void setBookingApp(String bookingApp) {
		this.bookingApp = bookingApp;
	}	
	
	public void writetoFile(){
		String details = getLastName() + getFirstName()+ ";" + getAddress()  + ";" + getUsername() + ";" + getPassword() + ";" + bookingApp + ";";
		ReadAndWrite.WriteDetails("dentist.txt", details);
	}
		
	@Override
	public String toString() {
		return "Dentist [Booking App=" + bookingApp + ", First Name=" + getFirstName() + ", Last Name="
				+ getLastName() + "Address=" + getAddress() + ", Username=" + getUsername() + ", Password=" + getPassword()
				+ ", toString()=" + super.toString();
	}
}
	
	
