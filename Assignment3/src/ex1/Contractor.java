package ex1;

import ex1.Person.Address;

@SuppressWarnings("unused")
public class Contractor extends Employee{
	
	private double hourlyPay;
	
	Contractor(){}
	
	Contractor(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	Contractor(String firstName, String lastName, Address address){
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
		return "Contractor " + this.getFirstName() + " " + this.getLastName() 
		+ "  Employee's ID: " + this.getId() + " SSN: " + this.getSocialNumber();
	}
	
	@Override
	public void introduce() {
		System.out.println("Hi I am " + this.toString());
	}
	
	public double computePay(double numberOfHours) {
		return this.getHourlyPay() * numberOfHours;
	}
	
}
