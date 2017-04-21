package Model;

import java.util.Scanner;
import Data.ReadAndWrite;


public class Patient extends User{
	
	private String cprNumber,telephone;
	
	public Patient(){
		super();
		cprNumber = "";
		telephone = "";
	}

	
	public Patient(String fname, String lname, String address, String username, String password,String cprNumber, String telephone){
		super (fname, lname, address, username, password);
		this.cprNumber = cprNumber;
		this.telephone = telephone;
	};
	
	public String getCprNumber() {
		return cprNumber;
	}

	public void setCprNumber(String cprNumber) {
		this.cprNumber = cprNumber;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void writetoFile(){
		String details = getLastName() + getFirstName() + ";" + getAddress() +";" + getUsername() + ";" + getPassword() + ";"+ cprNumber + ";"+ telephone+ ";";
		ReadAndWrite.WriteDetails("patient.txt", details);
	}
	
	@Override
	public String toString() {
		return "Patient [First Name=" + getFirstName() + ", Last Name=" + getLastName() + ", Address=" + getAddress() + ", CPR Number=" + cprNumber + ", Telephone=" + telephone
				+ ", Username=" + getUsername() + ", Password =" + getPassword() + "]";
	}
		

	
}
