package Model;
import java.util.*;
import Data.ReadAndWrite;

public class UserDatabase {

	
		ArrayList<Dentist> dDatabase;
		ArrayList<Patient> pDatabase;
		
		public UserDatabase(){
			pDatabase = ReadAndWrite.getAllPatientDetails();
			dDatabase = ReadAndWrite.getAllDentistDetails();
		}

	}

