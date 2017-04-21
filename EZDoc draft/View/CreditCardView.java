package View;
// import model.CreditCard;
import java.util.Scanner;

import Model.CreditCard;

public class CreditCardView {

	public CreditCard getCardDetails(){

		CreditCard cc1 = new CreditCard();
		System.out.println("Enter a credit card number: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String cardDetails;
		cardDetails = input.next();

		String card = cardDetails;
		Boolean validity;

		card = card.substring(0, (card.length()));
		char[] cardArray = card.toCharArray();
		int[] cardIntArray = new int[cardArray.length];

		for (int i = 0; i < cardArray.length; i++)
		{
			cardIntArray[i] = Character.getNumericValue( cardArray[i] );
		}
		//starts at index 0 so this is OK.
		for (int j = 0; j < cardIntArray.length; j++)
		{
			if ( (j % 2) == 0)
			{
				cardIntArray[j] = cardIntArray[j] * 2;
			}
		}
		// Takes away 9 from the selected digits.
		for (int k = 0; k < cardIntArray.length; k++)
		{
			if (cardIntArray[k] > 9)
			{
				cardIntArray[k] = cardIntArray[k] - 9;
			}
		}
		//Sums everything up..
		int addedNumbers = 0;

		for (int l = 0; l < cardIntArray.length; l++)
		{
			addedNumbers += cardIntArray[l];
		}

		if (addedNumbers % 10 == 0)
		{
			validity = true;
			cc1.setCardNumber(cardDetails);
			;
		}
		else
		{           
			validity = false;
		}

		if (!validity)	
		{  	System.out.println("Your card entry is invalid.");
		System.exit(0); }

		if (cardDetails.startsWith("4") && (cardDetails.length() == 13 ^ cardDetails.length() == 16))
		{
			cardDetails = "Visa / Visa Dankort"; //USE SWITCH AND MATHCES WITH
			cc1.setCType(cardDetails);
		}
		else if (cardDetails.startsWith("5") && cardDetails.length() == 16) 
		{
			cardDetails = "MasterCard";
			cc1.setCType(cardDetails);
		}
		else if (cardDetails.startsWith("6") && (cardDetails.length() == 16 ^ cardDetails.length() == 19))
		{
			cardDetails =  "Discover";
			cc1.setCType(cardDetails);
		}
		else if (cardDetails.startsWith("37") && cardDetails.length() == 15)
		{
			cardDetails =  "American Express";
			cc1.setCType(cardDetails);
		}
		else
		{
			System.out.println("Unknown type.");
			System.exit(0); }

		System.out.println("Thanks for entering your " + cardDetails + " credit card number.");

		System.out.println("Please enter the expiry date in the format MM/YY: ");
		cardDetails = input.next();
		if (cardDetails.length()==5)
			cc1.setExpiry(cardDetails);
		else 
			System.out.println("Invalid expiry date.");
		System.out.println("Please enter the 3 digit CSC code on the reverse of your card: ");
		cardDetails = input.next();

		if (cardDetails.matches("[0-9]+") && cardDetails.length()==3){
			cc1.setcSC(cardDetails);
		System.out.println("Thank you, your card has been accepted."); }
		else
			System.out.println("Invalid CSC.");

		//	System.out.println(cc1);
		return cc1;

	}
	
	public void printCardDetails(CreditCard cc1) {

	System.out.println(cc1.toString());
} 
}
