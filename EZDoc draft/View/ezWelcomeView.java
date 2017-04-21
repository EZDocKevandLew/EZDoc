package View;

import java.util.Scanner;

public class ezWelcomeView {

	public ezWelcomeView(){
		
	}
		
	public int menuSelect(){
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("   WELCOME TO THE EZ DOC ONLINE PORTAL!   ");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("What do you want to do?");
		System.out.println("Select one of the options below by pressing the respective number.");
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("|1| I want to make a booking.");
		System.out.println("|2| I am a returning customer and would like to check my orders.");
		System.out.println("|3| I am a Dentist and would like to check my schedule");
		System.out.println("|4| Quit");
		System.out.println("-----------------------");
		
		int answer = input.nextInt();

	   return answer;
	}//method menuSelect	
}//class ezWelcomeView
	
	

	