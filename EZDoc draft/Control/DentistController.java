package Control;

import Model.Dentist;
import View.DentistView; //to be completed
import View.ezWelcomeView;

public class DentistController {
	
	private Dentist myDentist = new Dentist();
	private DentistView myDentistView = new DentistView();
	private ezWelcomeView welcome = new ezWelcomeView();

		public DentistController(Dentist myDentist, DentistView myDentistView){
			this.myDentist = myDentist;
			this.myDentistView = myDentistView;
		}

		public void createDentistPractice(){
			myDentist = myDentistView.getDentistDetails();
		}
		
		public void print(){
			myDentistView.printDentistDetails(myDentist);
		}
}
