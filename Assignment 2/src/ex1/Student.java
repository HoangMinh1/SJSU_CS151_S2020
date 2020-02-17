package ex1;

import java.util.LinkedList;

public class Student {
	
	/*class attribute defined here*/
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	private String major;
	private String department;
	//class schedule type linked list
	private LinkedList<Course> schedule;
	
	/*class methods*/
	//constructor
	Student(String firstName, String lastName){
		schedule = new LinkedList<Course>();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	Student(){
		schedule = new LinkedList<Course>();
	}
	
	//setter methods
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//getter methods
	
	public String getName() {
		String name = this.firstName + this.lastName;
		return name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public String getDepartment() {
		return this.department;
	}
	//get schedule method
	public LinkedList<Course> getSchedule(){
		return this.schedule;
	}
	//add course to the list
	public void addCourse(String courseName) {
		Course newCourse = new Course(courseName);
		this.schedule.add(newCourse);
	}
	
	//nested class
	public class Course {
		//Course attributes
		private String courseName;
		//constructor
		Course(String name){
			this.courseName = name;
		}
		Course(){
			
		}
		//setter
		public void setName(String name) {
			this.courseName = name;
		}
		//getter
		public String getName() {
			return this.courseName;
		}
		//print schedule
		void printSchedule() {
			
			for(int index = 0; index < schedule.size(); index++) {
				System.out.println(schedule.get(index).getName());
			}
			
		}
	}
}
