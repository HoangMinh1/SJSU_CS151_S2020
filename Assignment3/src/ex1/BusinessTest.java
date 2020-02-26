package ex1;

public class BusinessTest {

	public static void main(String[] args) {
		System.out.println("Full-Time Yearly Employees: ");
		FullTimeSalaryEmployee employee1 = new FullTimeSalaryEmployee("John", "Smith");
		FullTimeSalaryEmployee employee2 = new FullTimeSalaryEmployee("Erin", "Cushner");
		employee1.introduce();
		employee2.introduce();
		System.out.println("Employee 1' Salary: $" + employee1.computePay(4.5));
		System.out.println("Employee 2' Salary: $" + employee2.computePay(3.7));
		System.out.println();
		
		System.out.println("Full-Time Hourly Employees: ");
		FullTimeHourlyEmployee employee3 = new FullTimeHourlyEmployee("Hoang", "Nguyen");
		FullTimeHourlyEmployee employee4 = new FullTimeHourlyEmployee("Ybinh", "Do");
		employee3.introduce();
		employee4.introduce();
		System.out.println("Employee 3' Salary: $" + employee3.computePay(12, 3.5));
		System.out.println("Employee 4' Salary: $" + employee4.computePay(10, 2));
		System.out.println();
		
		System.out.println("Part-Time Hourly Employees: ");
		PartTimeHourlyEmployee employee5 = new PartTimeHourlyEmployee("Summer", "Time");
		PartTimeHourlyEmployee employee6 = new PartTimeHourlyEmployee("Winter", "Christmas");
		employee5.introduce();
		employee6.introduce();
		System.out.println("Employee 5' Salary: $" + employee5.computePay(42));
		System.out.println("Employee 6' Salary: $" + employee6.computePay(2));
		System.out.println();
		
		System.out.println("Contractors: ");
		Contractor employee7 = new Contractor("John", "Adam");
		Contractor employee8 = new Contractor("Dwayne", "Johnson");
		employee7.introduce();
		employee8.introduce();
		System.out.println("Employee 7' Salary: $" + employee7.computePay(10));
		System.out.println("Employee 8' Salary: $" + employee8.computePay(5.6));
		System.out.println();
		
		System.out.println("Executives: ");
		Executive employee9 = new Executive("Ngoc", "Vu");
		Executive employee10 = new Executive("Trinh", "Bao");
		employee9.introduce();
		employee10.introduce();
		System.out.println("Employee 9' Salary: $" + employee7.computePay(10));
		System.out.println("Employee 10' Salary: $" + employee8.computePay(5.6));
		System.out.println();
		
		System.out.println("Customer: ");
		Customer customer1 = new Customer("Moji", "Sam");
		Customer customer2 = new Customer("Smith", "Will");
		customer1.setPayMethod(Customer.PaymentType.credit);
		customer1.introduce();
		customer2.introduce();
		customer1.makePayment();
		customer2.makePayment();
		System.out.println();
	}

}
