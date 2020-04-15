package ex2;

public class Test {

	public static void main(String[] args) {
		Student john = new Student("john", "smith");
		Course cs159 = new Course("CS159", "Parallel Process", 15, Day.MONDAY);
		Course cs151 = new Course("CS151", "OOP", 10, Day.TUESDAY);
		Course cs100W = new Course("CS100W", "Writing Workshop", 12, Day.THURSDAY);
		
		john.addCourse(cs100W);
		john.addCourse(cs159);
		john.addCourse(cs151);
		
		john.sortCourse(true, "time");
		for(int i = 0; i < john.getCourseList().size(); i++) {
			System.out.println(john.getCourseList().get(i));
		}
		
	}

}
