package ex1;

import ex1.Person.Address;

@SuppressWarnings("unused")
public class PartTimeHourlyEmployee extends Employee{
	
	private double hourlyPay;
	
	PartTimeHourlyEmployee(){}
	
	PartTimeHourlyEmployee(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	PartTimeHourlyEmployee(String firstName, String lastName, Address address){
		super(firstName, lastName, address);
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	//methods
	@Override
	public String toString() {
		return "Part-time Hourly Employee " + this.getFirstName() + " " + this.getLastName() 
		+ "  Employee's ID: " + this.getId() + " SSN: " + this.getSocialNumber();
	}
	
	@Override
	public void introduce() {
		System.out.println("Hi I am " + this.toString());
	}
	
	public double computePay(double numberOfHours) {
		if(numberOfHours > 40)
			return -1;
		else
			return this.getHourlyPay() * numberOfHours;
	}

}
