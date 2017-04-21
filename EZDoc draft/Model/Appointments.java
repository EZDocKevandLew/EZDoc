package Model;

import Data.ReadAndWrite;

public class Appointments {
	private String type, price, date, doctor, patientid;

	
	public Appointments(String type,String price,String date,String doctor, String patientid){
		this.type = type;
		this.price = price;
		this.date = date;
		this.doctor = doctor;
		this.patientid = patientid;
	//	this.appointmentsAvailable = appointmentsAvailable;
			
	}
	
/*	public Appointments(){
		appointmentsAvailable++;
		//I want an appointment to be taken up once booked. I suppose something like
		//this could work. Maybe it would work better with a boolean statement..?
		}*/
	
	public Appointments() {
		type = "";
		price = "";
		date = "";
		doctor = "";
		patientid = "";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDoctor() {
		return doctor;
	}
	
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Appointments [Type=" + type + ", Price=" + price + ", Date=" + date + ", Doctor=" + doctor + "]";
	}
	
	public String getPatientid() {
		return patientid;
	}

	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}

	public void writetoFile(){
		String details = type + ";" + price + ";" + date + ";" + doctor + ";";
		ReadAndWrite.WriteDetails("appointment.txt", details);
	}

}
