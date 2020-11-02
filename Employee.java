import java.sql.Date;
import java.util.Objects;

abstract class Employee {
	private String firstName, lastName, email, phoneNumber, startDate;
	
	public Employee(String firstName, String lastName, String email, String phoneNumber, String startDate) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setStartDate(startDate);
	}
	
	abstract double calculateIncome();
	
	public String getStartDate() {
		return startDate;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber.isEmpty() || Objects.isNull(phoneNumber) ? "Unknown" : phoneNumber;
	}
	
	public void setEmail (String email) {
		this.email = email.isEmpty() || Objects.isNull(email) ? "Unknown" : email;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName.isEmpty() || Objects.isNull(firstName) ? "Unknown" : firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName.isEmpty() || Objects.isNull(lastName) ? "Unknown" : lastName;
	}
	
	@Override
	public String toString() {
		return String.format("First Name: %s" +
							 "\nLast Name: %s" +
							 "\nEmail: %s" +
							 "\nPhone Number: %s" +
							 "\nStart Date: %s", firstName, lastName, email, phoneNumber, startDate);
	}
}


