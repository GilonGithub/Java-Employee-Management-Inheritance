
public class SalesEmployee extends Employee {
	
	private double commissionRate, totalSales;
	
	public SalesEmployee(String firstName, String lastName, String email, String phoneNumber, String startDate, double commissionRate, double totalSales) {
		super(firstName, lastName, email, phoneNumber, startDate);
		setCommissionRate(commissionRate);
		setTotalSales(totalSales);
		
	}
	
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate > 0 ? commissionRate : 1.0;
	}
	
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales > 0 ? totalSales : 1.0;
	}
	
	public double getTotalSales() {
		return totalSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public double calculateIncome() {
		return commissionRate * totalSales;
	}

	@Override
	public String toString() {
		return String.format(super.toString() +
							 "\n  Total Sales: %f" +
							 "\n  Commission Rate: %f" +
							 "\n  Total Income: $%f", totalSales, commissionRate, calculateIncome());
	}
}