package ex1;

public class Employee extends Person {
	//attributes
	private String id;
	private String accomodation;
	
	//constructors
	Employee(){
		this.accomodation = "None";
	}
	Employee(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	Employee(String firstName, String lastName, Address address){
		super(firstName, lastName, address);
	}
	
	//sets and gets
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAccomodation() {
		return accomodation;
	}
	public void setAccomodation(String accomodation) {
		this.accomodation = accomodation;
	}
	
	//class methods
	
	public double computePay() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Employee " + this.getFirstName() + " " + this.getLastName() 
		+ "  Employee's ID: " + this.getId() + " SSN: " + this.getSocialNumber();
	}
	
	@Override
	public void introduce() {
		System.out.println("Hi I am " + this.toString());
	}
	
}
