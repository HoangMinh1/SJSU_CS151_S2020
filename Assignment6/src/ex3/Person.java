package ex3;


class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	Person(String first, String last, int age){
		this.firstName = first;
		this.lastName = last;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.age;
	}
	
}
