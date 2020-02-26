package ex1;


public class FullTimeHourlyEmployee extends Employee{
	private double overTimePay;
	private double hourlyPay;
	
	FullTimeHourlyEmployee(){}
	
	FullTimeHourlyEmployee(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	FullTimeHourlyEmployee(String firstName, String lastName, Address address){
		super(firstName, lastName, address);
	}
	
	public double getOverTimePay() {
		return overTimePay;
	}
	public void setOverTimePay(double overTimePay) {
		this.overTimePay = overTimePay;
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
		return "Full-time Hourly Employee " + this.getFirstName() + " " + this.getLastName() 
		+ "  Employee's ID: " + this.getId() + " SSN: " + this.getSocialNumber();
	}
	
	@Override
	public void introduce() {
		System.out.println("Hi I am " + this.toString());
	}
	
	public double computePay(double numberOfHours, double numberOfOverTimeHours) {
		return this.getHourlyPay() * numberOfHours + 
				this.getOverTimePay() * numberOfOverTimeHours;
	}

}
