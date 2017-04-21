package Model;

public class TypeSpecial extends Appointments {
	String riskFactor, offering, duration;
	

public TypeSpecial (String type, String offering, double price, String riskFactor, String doctor, String date, String duration, int appointmentsAvailable){
	super(type, price, date, doctor, appointmentsAvailable);
	this.riskFactor = riskFactor;
	this.offering = offering;
	this.duration = duration;
}

public String getRiskFactor() {
	return riskFactor;
}

public void setRiskFactor(String riskFactor) {
	this.riskFactor = riskFactor;
}

public String getOffering() {
	return offering;
}

public void setOffering(String offering) {
	this.offering = offering;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}

}

	

