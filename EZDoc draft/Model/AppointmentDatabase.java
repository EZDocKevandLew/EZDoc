//modeled on projectdatabase class
package Model;

import java.util.ArrayList;

public class AppointmentDatabase {
	
ArrayList<TypeRegular> regularTreatments = new ArrayList<TypeRegular>();
ArrayList<TypeSpecial> somethingSpecial = new ArrayList<TypeSpecial>();
ArrayList<Dentist> dentistDatabase = new ArrayList<Dentist>();



public AppointmentDatabase () {
	
//Type (S), Name (S), Date (S), Price (D), Doctor (S), Duration (S), Appointments Available (I)

regularTreatments.add(new TypeRegular("Full check-up", "Royal Brush", "01/08 2017", 600, "Moe Leicester", "1 hour", 5));
regularTreatments.add(new TypeRegular("Regular check", "Royal Brush", "01/08 2017", 600, "Moe Leicester", "1 hour", 5));
regularTreatments.add(new TypeRegular("Regular check", "Royal Brush", "01/08 2017", 600, "Moe Leicester", "1 hour", 5));
regularTreatments.add(new TypeRegular("Regular check", "Royal Brush", "01/08 2017", 600, "Moe Leicester", "1 hour", 5));


//Type (S), Offering (S), Price (D), Risk Factor (S), Doctor (S), Date (S), Duration (S), AppointmentsAvailable (I)

somethingSpecial.add(new TypeSpecial("Specials", "Platinum Grillz", 10000, "Low", "Mike Hunt", "30/05/2017", "5 hours", 3)); 
somethingSpecial.add(new TypeSpecial("Specials", "Premium Grillz made from the reforged metal from King Arthurs swords", 100000, "Low", "Merton Ling", "30/05/2017", "5 hours", 1)); 
somethingSpecial.add(new TypeSpecial("Specials", "Wooden Dentures retrieved from Abe Lincoln", 3000, "Medium", "George Washingdents", "30/05/2017", "3 hours", 1)); 
somethingSpecial.add(new TypeSpecial("Specials", "Platinum Grillz", 10000, "High", "Mike Hunt", "30/05/2017", "5 hours", 3)); 
somethingSpecial.add(new TypeSpecial("Specials", "Budget Jaw realignement", 350, "High", "Joe Slammer", "Weekdays after closing hours", "30 seconds", 3)); 
somethingSpecial.add(new TypeSpecial("Specials", "Premium Jaw realignement", 9000, "Low", "Phillippa Phixit", "25/04/2017", "7 hours", 1)); 
somethingSpecial.add(new TypeSpecial("Specials", "Premium Jaw realignement", 9000, "Low", "Phillippa Phixit", "30/04/2017", "7 hours", 1)); 
somethingSpecial.add(new TypeSpecial("Specials", "Premium Jaw realignement", 9000, "Low", "Phillippa Phixit", "05/05/2017", "7 hours", 1)); 
somethingSpecial.add(new TypeSpecial("Specials", "Experimental Surgical Robot Jaw reconstruction", 500, "Very High", "T900", "15/05/2017", "4 hours", 10)); 



}

public void browseRegular() {
    if (!regularTreatments.isEmpty())
    {
    	System.out.println("Available treatments:\n");
        for (TypeRegular R : regularTreatments)
        {
            System.out.println("Type: " + R.getType());
            System.out.println("Service: " + R.getName());
            System.out.println("Date: " + R.getDate());
            System.out.println("Doctor: " + R.getDoctor());
            System.out.println("Duration: " + R.getDuration());
            System.out.println("Price: " + R.getPrice() + " DKK\n");
        }
       
    }
   
    else System.out.println("Sorry, no dates available. Check back later, or give us a call at [phone number]");
   
    }

public void browseSpecials() {
    if (!somethingSpecial.isEmpty())
    {
        System.out.println("Current specials:\n");
        for (TypeSpecial S : somethingSpecial)
        {
            System.out.println("Type: " + S.getType());
            System.out.println("Offering: " + S.getOffering());
            System.out.println("Risk: " + S.getRiskFactor());
            System.out.println("Timeslot: " + S.getDate());
            System.out.println("Doctor: " + S.getDoctor());
            System.out.println("Duration: " + S.getDuration());
            System.out.println("Price: " + S.getPrice() + " DKK\n");
        }
       
    }
   
    else System.out.println("Sorry, it seems that we're out of special offerings. Feel free to check back with us later or submit a suggestion +"
    		+ " for our idea box.");
   
    }

public void browseDentists() {
	if (!dentistDatabase.isEmpty())
    {
        for (Dentist D : dentistDatabase)
        {
            System.out.println("\n List of dentists: ");
            System.out.println("Doctor: " + D.getFirstName() + D.getLastName());
        }
   
    }

	else System.out.println("Sorry, it seems that we're out of special offerings. Feel free to check back with us later or submit a suggestion +"
		+ " for our idea box.");

}
}






