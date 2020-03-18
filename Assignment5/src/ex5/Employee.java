package ex5;

class Employee {

	private String firstName;
	private String lastName;
	private String id;
	private double hourlyPay;
	
	Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	public void computePay(int hour) {
		try {
			if(hour < 0)
				throw new NumberFormatException("Number of hours cannot be negative");
			else if(hour > 40)
				throw new TooManyHoursWorkedException("Number of hours cannot exceed 40");
			else
				System.out.println(this.firstName + "'s salary for " + hour + 
						" hours is " + hourlyPay * hour);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
		
	
	class NumberFormatException extends Exception{
		NumberFormatException(String s){
			super(s);
		}
	}
	
	class TooManyHoursWorkedException extends Exception{
		TooManyHoursWorkedException(String s){
			super(s);
		}
	}
}
