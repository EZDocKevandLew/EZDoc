//modeled on book class
package Model;

public class TypeRegular extends Appointments {
		String name, duration;
		
	public TypeRegular (String type, String name, String date,double price, String doctor, String duration, int appointmentsAvailable){
		super(type,price, date, doctor, appointmentsAvailable);
		this.name=name;
		this.duration=duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
