package Model;


	public class User {

	private String firstName, lastName, address, username, password;

	public User(String fname, String lname, String address, String username, String password){
	   firstName = fname;
	   lastName = lname;
	   this.address = address;
	   setUsername();
	   setPassword();
		
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void setUsername() {
		this.username = firstName.charAt(0)+lastName.substring(0, 3);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword() {
		this.password = lastName.substring(0, 3);
	}


/*	public void writetoFile(){
		String details = lastName+ "; " + firstName + ";" + getUsername() + ";" + getPassword() + ";" + address +";" + cprNumber + ";"+ telephone+ ";";
		ReadandWrite.WriteDetails("user.txt", details);
		 
	} */

	}

