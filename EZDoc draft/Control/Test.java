package Control;
import java.util.*;

public class Test {
	
	public static void main(String[] args){
	//	Dentist A = new Dentist();
		
		CreditCard cc2 = new CreditCard();
		//USE  FOR VALID CARD NUMBER
		cc2 = cc2.getCardDetails();
		//one way. Your method getCardDetails returns an object and you are not
				// assigning it to a value but I would not do it this way. 
				
				//I would do it the way I have shown customerView class but this syntax wise it is correct too.
				//if you want to keep the current structure, I would not use return type in the getCardDetails - change it to void.
				//then you just call cc2.getCardDetails();
		System.out.println(cc2.toString());
		
			
	}

	/*
	DISCLAIMER:
	This is just an example from last year's taxi project.
	It is perfectly possible to code these parts differently.
	Don't forget to check the example code from the webshop project as well, to get a better understanding of file reading and writing.
	*/

	import java.io.*;
	import java.util.*;

	public class Client {
		public void saveUser(String uname, String pass, String fname, String lname, String email) {
			// the name of the file to open
			String fileName = "users.txt";
			try {
				// write user information to a file by adding a new line at the bottom of the file
				Writer output;
				output = new BufferedWriter(new FileWriter(fileName, true)); output.append("\r\n");
				output.append(uname + ", " + pass + ", " + fname + ", " + lname + ", " + email);
				output.close();
			} catch (IOException ex) {
				// if the file is not accessible, print this message
				System.out.println("Error writing to file '" + fileName + "'");
			}
		}

		

		/*
		**********************************************
		* TEST CASE - LOADING USERS FROM A TEXT FILE *
		**********************************************

		The loadUsers method has been tested for a couple of possible scenarios, to make sure that it always works
		1. The users.txt file exists and already has users in it: this is the default scenario, the method just adds the new user to the bottom of the list
		2. The file does not exist: this is the case on the program's first run, when you create the first user. 
			-> workaround: file will automatically be created and the method will be reloaded, then the user can be entered into the file normally (as in scenario 1)
		3.  The users.txt file exists, but has empty lines: this only occurs when somebody manually modifies the contents of the file (which IS possible because this is a TXT file, not a database).
			-> workaround: empty lines are not added to the users array, so they will not have any impact on the code
		*/

		// this method is static and therefore accessed in the main class with the code CLASSNAME.loadUsers(); (in this case Client.loadUsers)
		public static void loadUsers() {
			String fileName = "users.txt";

			try {
				Scanner in = new Scanner(new File(fileName));
				List<String[]> lines = new ArrayList<>();
				
				// each line of the file is checked; user variables are separated by commas so the code checks if a comma is present on each line
				// lines without commas (so empty lines) will not be added to the list of lines; each line contains an array called splitted, which consists of all variables on that line
				// a line is thus a user account and splitted contains the username, password, etc.
				while (in.hasNextLine()) {
					String line = in.nextLine().trim();
					if (line.contains(",")) {
						String[] splitted = line.split(", ");
						lines.add(splitted);
					}
				}

				// convert list to array: List<String[]> to String[][]
				String[][] users = new String[lines.size()][];
				for (int i = 0; i < users.length; i++) {
					users[i] = lines.get(i);
				}

			}
		
			// in case the file is not found: create the file and add the admin account to it, so a blank file cannot exist;
			// also, then users cannot claim the admin account, so it can be used for managing tasks in the future, like analyzing historical booking data
			catch (FileNotFoundException ex) {
				try {
					Writer output;
					output = new BufferedWriter(new FileWriter(fileName, true));
					output.write("admin, admin123, Admin, Istrator, admin@taxi.com");
					output.close();
				} catch (IOException ex2) {
					System.out.println("Error writing to file '" + fileName + "'");
				}

				loadUsers();

			// in case the file is not reachable for other reasons: overwrite the file and add the admin account to it,  for the same reasons as stated above
			} catch (IOException ex) {
				try {
					Writer output;
					output = new BufferedWriter(new FileWriter(fileName, true));
					output.write("admin, admin123, Admin, Istrator, admin@taxi.com"); // output.write overwrites file if it already exists
					output.close();
				} catch (IOException ex2) {
					System.out.println("Error writing to file '" + fileName + "'");
				}

				loadUsers();
			}
		}
	}
	
	
}
