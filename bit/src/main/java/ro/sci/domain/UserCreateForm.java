package ro.sci.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class UserCreateForm {
	
	@NotEmpty
	private String firstName ;
	
	@NotEmpty
	private String lastName ;
	
	@NotEmpty
	private String email ;
	
	@NotEmpty
	private String password ;
	
	@NotEmpty
	private String passwordRepeated ;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRepeated() {
		return passwordRepeated;
	}

	public void setPasswordRepeated(String passwordRepeated) {
		this.passwordRepeated = passwordRepeated;
	}
	
	
}
