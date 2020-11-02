import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		HourlyEmployee he1 = new HourlyEmployee("Derek", "Rama", "drama@yahoo.com", "123123123", "02-30-2006", 21.50, 40);
		HourlyEmployee he2 = new HourlyEmployee("Diego", "Darko", "ddarko@yahoo.com", "444333221", "07-30-1998", 35.20, 40);
		SalesEmployee se1 = new SalesEmployee("Sam", "Sieko", "ssieko@gmail.com", "5665657888", "04-28-2000", 0.15, 12000.30);
		SalesEmployee se2 = new SalesEmployee("Sierra", "Soda", "ssoda@gmail.com", "7594303833", "05-18-1985", 0.30, 30000.20);
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(he1);
		employees.add(he2);
		employees.add(se1);
		employees.add(se2);
		
		for(Employee e: employees) {
			System.out.println(e + "\n");
		}
		
	}

}
