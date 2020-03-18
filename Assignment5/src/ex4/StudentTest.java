package ex4;

class StudentTest {

	public static void main(String[] args) {
		Student john = new Student("John", "Smith");
		john.setAge(20);
		john.setGpa(3.6);
		john.setMajor("Computer Science");
		john.setDepartment("School of Computer Science");
		
		try {
			Student cloneStudent = (Student) john.clone();
			john.printInfo();
			cloneStudent.printInfo();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
