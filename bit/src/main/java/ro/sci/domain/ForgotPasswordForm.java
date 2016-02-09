package ro.sci.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class ForgotPasswordForm {
	
	@NotEmpty(message = "enter a first name")
	private String firstName;
	
	@NotEmpty(message = "enter a last name")
	private String lastName;
	
	@NotEmpty(message = "enter an email")
	private String email;

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
}
