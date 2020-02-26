package ex1;

public class Customer extends Person {

	public enum PaymentType {cash, check, credit} 
	public enum DirectDeposit{yes, no}
	
	private String customerID;
	private PaymentType payMethod;
	private DirectDeposit deposit;

	Customer(){
		//default value
		this.payMethod = PaymentType.cash;
		this.deposit = DirectDeposit.no;
	}
	
	Customer(String firstName, String lastName){
		super(firstName, lastName);
	}
	
	Customer(String firstName, String lastName, Address address){
		super(firstName, lastName, address);
	}
	
	//sets and gets method
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public PaymentType getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(PaymentType payMethod) {
		this.payMethod = payMethod;
	}

	public DirectDeposit getDeposit() {
		return deposit;
	}

	public void setDeposit(DirectDeposit deposit) {
		this.deposit = deposit;
	}
	
	//methods
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() +
				" Customer ID: " +this.customerID;
	}

	@Override
	public void introduce() {
		System.out.println("Hi I am a customer: " + this.toString());
	}
	
	public void makePayment() {
		System.out.println("Prefered methods :" + this.getPayMethod());
	}

}
