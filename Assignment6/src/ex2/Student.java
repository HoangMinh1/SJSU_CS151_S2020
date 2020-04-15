package ex2;

import java.util.Comparator;
import java.util.LinkedList;

class Student {
	private String first;
	private String last;
	private int age;
	private double gpa;
	private String major;
	private String department;
	private LinkedList<Course> courseList;
	
	
	public void addCourse(Course c) {
		this.courseList.add(c);
	}
	
	public void removeCourse(Course c) {
		this.courseList.remove(c);
	}
	
	public void sortCourse(boolean ascending, String attribute ) {
		Comparator<Course> comp;
		switch(attribute) {
			case "name":
				comp = Comparator.comparing(Course::getCourseName);
				break;
			case "description":
				comp = Comparator.comparing(Course::getCourseDescription);
				break;
			case "time":
				comp = Comparator.comparing(Course::getStartTime);
				break;
			case "day":
				comp = Comparator.comparing(Course::getWeekDay);
				break;
			default:
				System.out.println("No such attribute!");
				return;
		}
		if(ascending == false)
			comp = comp.reversed();
		this.courseList.sort(comp);
	}
	
	
	Student(String first, String last){
		this.first = first;
		this.last = last;
		this.courseList = new LinkedList<Course>();
	}
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
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
	public LinkedList<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(LinkedList<Course> courseList) {
		this.courseList = courseList;
	}
}
