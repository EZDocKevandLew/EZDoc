package Model;

public class CreditCard {

	private String cardNumber, expiry, cSC, cType;

	
	public CreditCard(){
		cardNumber = "";
		expiry = "";
		cSC = "";
		cType = "";	
	}

	public CreditCard(String ccNum, String exp, String c, String ctyp){
		cardNumber = ccNum;
		expiry = exp;
		cSC = c;
		cType = ctyp;
	} 

	public String getCardNumber(){
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getcSC() {
		return cSC;
	}

	public void setcSC(String cSC) {
		this.cSC = cSC;
	}

	public void setCType (String cType){
		this.cType = cType;
	}

	public String getCType(){
		return cType;
	}

	public String toString(){
		return (cardNumber + " " + expiry + " " + cSC + " " + cType);
	}

	
	
}