package View;
import java.util.ArrayList;
import Model.Dentist;
import Model.Patient;
import Data.ReadAndWrite;
import java.util.Scanner;

public class LogInView {
		
		private ArrayList<Patient>patientDetails;
		private ArrayList<Dentist>dentistDetails;
		
		public LogInView(){
			patientDetails = ReadAndWrite.getAllPatientDetails();
			dentistDetails = ReadAndWrite.getAllDentistDetails();
		}

		
		public boolean login(){
			
			String password = "";
			String username = "";
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
		
			
			int numbersOfTries = 3;
			int counterTries = 0; 
			boolean loggedIn = false;  
			
			do{
				counterTries++;
				
				//Prompt the user for username and password
				
				System.out.println("Type in your username: "); 
				username = input.nextLine();
				
				System.out.println("Type in your password: "); 
				password = input.nextLine();
				
				
		//		boolean userFound = false;
				//Here we go through the array with the usernames. 
				for(int i = 0; i < patientDetails.size() && !loggedIn; i++){
					//
					if(username.equalsIgnoreCase(patientDetails.get(i).getUsername()) && 
						password.equalsIgnoreCase(patientDetails.get(i).getPassword())){
						System.out.println("You are logged in as a patient!");
						loggedIn = true;
					}
					
				for (int j = 0; j < dentistDetails.size() && !loggedIn; j++){
				if(username.equalsIgnoreCase(dentistDetails.get(j).getUsername()) && 
						password.equalsIgnoreCase(dentistDetails.get(j).getPassword())){
						System.out.println("You are logged in as a dentist!");
						loggedIn = true;
					}
				}
				
				if(!loggedIn){
					System.out.println("Try again.");
				}
				
			while(counterTries < numbersOfTries && !loggedIn)
			
			return loggedIn;	
				}
			
				
			
	
			
			
		
