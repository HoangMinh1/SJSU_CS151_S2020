package ex1;

class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("John", "Smith");
		Student.Course schedule = student.new Course();
		student.setAge(20);
		student.setGPA(3.6);
		student.setMajor("Computer Science");
		student.setDepartment("School of Computer Science");
		student.addCourse("CS 151");
		student.addCourse("CS 146");
		student.addCourse("CS 149");
		schedule.printSchedule();
	}

}
