
public class HourlyEmployee extends Employee {
	private double payRate, hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, String email, String phoneNumber, String startDate, double payRate, double hoursWorked) {
		super(firstName, lastName, email, phoneNumber, startDate);
		setPayRate(payRate);
		setHoursWorked(hoursWorked);
		
	}
	
	public double calculateIncome() {
		return payRate * hoursWorked;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked > 0.0 && hoursWorked <= 40.0 ? hoursWorked : 1.0;
	}
	
	public void setPayRate(double payRate) {
		this.payRate = payRate > 0.0 ? payRate : 1.0;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + 
							 "\nPay rate: %f" +
							 "\nHours Worked: %f" +
							 "\nTotal Income: $%f", payRate, hoursWorked, calculateIncome());
	}
	
}
