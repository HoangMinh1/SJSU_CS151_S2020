package ex3;

public class Employee extends Person {
	
	/*Employee attribute defined here*/
	private String id;
	private String status;
	private String startDate;
	private double hourlyPay;
	private double yearlySalary;
	private double workingTime;
	//constructor
	Employee(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	//getters
	public String getId() {
		return this.id;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	
	public double getYearlySalary() {
		return this.yearlySalary;
	}
	
	public double getHourlyPay() {
		return this.hourlyPay;
	}
	
	public double getWorkingTime() {
		return this.workingTime;
	}
	
	//setters
	public void setID(String id) {
		this.id = id;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	public void setWorkingTime(double time) {
		this.workingTime = time;
	}
	
	//others methods;
	public double CalculatePay(double time) {
		//time can be # of weeks or # of hours
		if(status == "full time")
			//yearlyPay divided by 12 months and 4 weeks
			return (getYearlySalary() / 48) * time;
		else
			return getHourlyPay()*time;
	}
	@Override
	public void introduce() {
		System.out.println("Hi, my name is " + super.toString());
		System.out.println("My id is " + id);
		System.out.println("My employee status is " + status);
		System.out.println("Start date: " + startDate);
		System.out.println("My salary is " + CalculatePay(this.workingTime));
		System.out.println();
	}
}
