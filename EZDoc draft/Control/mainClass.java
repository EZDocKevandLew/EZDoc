//Application
package Control;
import java.util.Scanner;
import Model.Patient;		
import View.PatientView;
public class mainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Patient model = new Patient();
		PatientView view = new PatientView();
		PatientController controller = new PatientController(model,view);
	    controller.createPatient();
	    controller.print();
	    
//Application
	    
	    System.out.println("press 1 to log in or 0 for exit");	
		int login = input.nextInt();
		 
			switch(login) {
			case 1: break;
			case 0: System.exit(0);
	}
	    ezBooking c = new ezBooking();
	    c.Validation();
            
	}
	
}

