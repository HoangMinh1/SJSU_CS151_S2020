package ex1;

import ex1.Person.Address;

@SuppressWarnings("unused")
class Executive  extends  Employee{
	
	private int yearlySalary;
	private int yearlyBonus;
	
	Executive(){}
	
	Executive(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	Executive(String firstName, String lastName, Address address){
		super(firstName, lastName, address);
	}
	
	@Override
	public String toString() {
		return "Executive " + this.getFirstName() + " " + this.getLastName() + 
				" Employee ID: " + this.getId();
	}
	
	@Override
	public void introduce() {
		System.out.println("Hi I am an " + this.toString());
	}
	
	@Override
	public double computePay() {
		return getYearlySalary() + getYearlyBonus();
	}

	public int getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	public int getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(int yearlyBonus) {
		this.yearlySalary = yearlyBonus;
	}
}
