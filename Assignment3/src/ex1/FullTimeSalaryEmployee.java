package ex1;

public class FullTimeSalaryEmployee extends Employee{
	
	private int yearlySalary;
	
	//constructor
	FullTimeSalaryEmployee(){}
	
	FullTimeSalaryEmployee(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	FullTimeSalaryEmployee(String firstName, String lastName, Address address){
		super(firstName, lastName, address);
	}
	
	//set and get 
	public int getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	//methods
	@Override
	public String toString() {
		return "Full-time Yearly Employee " + this.getFirstName() + " " + this.getLastName() 
		+ "  Employee's ID: " + this.getId() + " SSN: " + this.getSocialNumber();
	}
	
	@Override
	public void introduce() {
		System.out.println("Hi I am " + this.toString());
	}
	
	public double computePay(double numberOfWeeks) {
		double weeklyRate = (this.getYearlySalary()/48);
		return  weeklyRate * numberOfWeeks;
	}
}
