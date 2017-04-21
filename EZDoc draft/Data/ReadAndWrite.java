package Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import Model.Patient;
import Model.Dentist;
import Model.Appointments;
import Model.User;

	public class ReadAndWrite {
		
	public static Scanner readDetails( String file){
		Scanner input = new Scanner(System.in);
				
		try {
		File ReadFile = new java.io.File(file);
		
		input = new Scanner(ReadFile);
		}
	    catch (FileNotFoundException ex){
	    	System.out.println("Error reading the file'" + file + "'");
	    }
		return input;
	}

	public static Patient getPatient(String line){
		Patient patientFromFile = new Patient();
		
			    String[] values = line.split(";");
		
				patientFromFile.setLastName(values[0]);
				patientFromFile.setFirstName(values[1]);
				patientFromFile.setAddress(values[2]);
				patientFromFile.setUsername(values[3]);
				patientFromFile.setPassword(values[4]);
				patientFromFile.setCprNumber(values[5]);
				patientFromFile.setTelephone(values[6]);
				
	     return patientFromFile;

	}
	//Suggested by Marjahan. 
	
	public static User getUser(String line){
		User userFromFile = new User();
			String[] values = line.split(";");
			
			userFromFile.setLastName(values[0]);
			userFromFile.setFirstName(values[1]);
			userFromFile.setAddress(values [2]);
			userFromFile.setUsername(values [3]);
			userFromFile.setPassword(values [4]);

			return userFromFile;
		
	}

	public static Dentist getDentist(String line){
		Dentist	dentistFromFile = new Dentist();
			String[] values = line.split(";");
			
			dentistFromFile.setLastName(values[0]);
			dentistFromFile.setFirstName(values[1]);
			dentistFromFile.setAddress(values [2]);
			dentistFromFile.setUsername(values [3]);
			dentistFromFile.setPassword(values [4]);
			dentistFromFile.setBookingApp(values [5]);

			return dentistFromFile;
		
	}

	public static Appointments getAppointments(String line){
		Appointments appointmentFromFile =  new Appointments();
		String[] values = line.split(";");
		
		appointmentFromFile.setType(values[0]);
		appointmentFromFile.setPrice(values[1]);
		appointmentFromFile.setDate(values[2]);
		appointmentFromFile.setDoctor(values[3]);
		appointmentFromFile.setPatientid(values[4]);
		
		return appointmentFromFile;
	}
	
	public static ArrayList<User> getAllUser(){
		ArrayList<User> userList = new ArrayList<User>();
		Scanner input = readDetails("patient.txt");

		while (input.hasNextLine()) {
			userList.add(getUser(input.nextLine())); }
		
		return userList;
	}

	public static ArrayList<Patient> getAllPatientDetails(){
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		Scanner input = readDetails("patient.txt");

		while (input.hasNextLine()) {
			patientList.add(getPatient(input.nextLine())); }
		
		return patientList;
	}
	
	public static ArrayList<Dentist> getAllDentistDetails(){
		ArrayList<Dentist> dentistList = new ArrayList<Dentist>();
		Scanner input = readDetails("dentist.txt");

		// checking each line 
		while (input.hasNextLine()) {
			
			dentistList.add(getDentist(input.nextLine())); }
		
		return dentistList;
	}

	public static ArrayList<Appointments> getAllAppointmentDetails(){
		ArrayList<Appointments> appointmentList = new ArrayList<Appointments>();
		Scanner input = readDetails("Appointment.txt");
		
		while (input.hasNextLine()) {
			
			appointmentList.add(getAppointments(input.nextLine()));
		}
		
		return appointmentList;
		
	}

	public static void WriteDetails(String file, String input){
		try{
		FileWriter fwriter = new FileWriter(file,true);
		PrintWriter output = new java.io.PrintWriter(fwriter);
		 // Write formatted output to the file
	    output.println(input);
	    output.close();
		}
		catch (IOException ex) {
			// if the file is not accessible, print this message
			System.out.println("Error writing to file '" + file + "'");
		}
	}
	}
	
	


