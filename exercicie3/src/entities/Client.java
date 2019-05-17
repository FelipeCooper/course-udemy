package entities;

import java.util.Date;

public class Client {
	
	private String name;
	private Date birthDate;
	private String email;
	
	public Client() {
		
	}
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getBirthDate() {
		return birthDate;
	}

}
