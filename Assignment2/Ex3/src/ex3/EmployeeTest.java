package ex3;

class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee first = new Employee("Joe", "Smith");
		first.setStatus("contractor");
		first.setHourlyPay(60);
		first.setWorkingTime(30);
		first.setID("01");
		first.setStartDate("May 1st");
		first.introduce();
		
		Employee second = new Employee("Lisa", "Grey");
		second.setStatus("full time");
		second.setYearlySalary(110000);
		second.setWorkingTime(2);
		second.setID("02");
		second.setStartDate("June 4th");
		second.introduce();
		
		Employee third = new Employee("Timothy", "Briggs");
		third.setStatus("full time");
		third.setYearlySalary(80000);
		third.setWorkingTime(4);
		third.setID("03");
		third.setStartDate("July 4th");
		third.introduce();
		
		Employee fourth = new Employee("George", "Wallace");
		fourth.setStatus("part time");
		fourth.setHourlyPay(20);
		fourth.setWorkingTime(25);
		fourth.setID("04");
		fourth.setStartDate("August 8th");
		fourth.introduce();
		
		Employee fifth = new Employee("Amy","Student");
		fifth.setStatus("contractor");
		fifth.setHourlyPay(45);
		fifth.setWorkingTime(45);
		fifth.setID("05");
		fifth.setStartDate("October 10th");
		fifth.introduce();
		
	}

}
