package ex5;

class EmployeeTest {

	public static void main(String[] args) {
		Employee john = new Employee("John", "Smith");
		john.setId("101");
		john.setHourlyPay(35);
		john.computePay(40);
		john.computePay(23);
		john.computePay(1);
		john.computePay(0);
		john.computePay(-5);
		john.computePay(45);

	}

}
