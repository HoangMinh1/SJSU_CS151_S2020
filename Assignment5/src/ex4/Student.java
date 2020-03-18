package ex4;

class Student implements Cloneable {
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	private String major;
	private String department;
	//course
	private Course cs151;
	private Course cs149;
	private Course cs159;
	private Course cs100w;
	
	Student(String firstName, String lastName){
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Course getCs151() {
		return cs151;
	}
	public void setCs151(String description, String startTime) {
		this.cs151.setCourseName("cs151");
		this.cs151.setCourseDescription(description);
		this.cs151.setStartTime(startTime);
	}
	public Course getCs149() {
		return cs149;
	}
	public void setCs149(String description, String startTime) {
		this.cs149.setCourseName("cs149");
		this.cs149.setCourseDescription(description);
		this.cs149.setStartTime(startTime);
	}
	public Course getCs159() {
		return cs159;
	}
	public void setCs159(String description, String startTime) {
		this.cs159.setCourseName("cs159");
		this.cs159.setCourseDescription(description);
		this.cs159.setStartTime(startTime);
	}
	public Course getCs100w() {
		return cs100w;
	}
	public void setCs100w(String description, String startTime) {
		this.cs100w.setCourseName("cs100w");
		this.cs100w.setCourseDescription(description);
		this.cs100w.setStartTime(startTime);
	}
	
	public void printInfo() {
		System.out.println(firstName + " " + lastName);
		System.out.println("age: " + age);
		System.out.println("gpa: " + gpa);
		System.out.println("major: " + major);
		System.out.println("department: " + department);
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
