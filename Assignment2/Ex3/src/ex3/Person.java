package ex3;

class Person {
	
	/*person attribute define here*/
	private String firstName;
	private String lastName;
	private int age;
	private int socialSecurityNumber;
	private String address;
	private String gender;
	private int weight;
	
	Person(){
		
	}
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString(){
		return this.firstName + this.lastName;
	}
	
	public void introduce() {
		System.out.println("Hi, my name is "+ this.firstName + this.lastName);
		System.out.println("I am " + age + " years old");
		System.out.println("SSN: " + socialSecurityNumber);
		System.out.println("My address is " + address);
		System.out.println("I am " + gender);
		System.out.println("My weight is " + weight);
	}
}
