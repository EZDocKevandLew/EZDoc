package Control;

import Model.Patient;
import View.PatientView;
import View.ezWelcomeView;

public class PatientController {

	
		private Patient myPatient = new Patient();
		private PatientView myPatientView = new PatientView();
		private ezWelcomeView welcome = new ezWelcomeView();
			
			public PatientController(Patient myPatient, PatientView myPatientView){
				this.myPatient = myPatient;
				this.myPatientView = myPatientView;
			}
			
			public void createPatient(){
				myPatient = myPatientView.getPatientDetails();
			}
			
			public void print(){
				myPatientView.printPatientDetails(myPatient);
			}

	}
