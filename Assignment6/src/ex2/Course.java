package ex2;



class Course {
	private String name;
	private String description;
	private int startTime;
	private Day weekDay;
	
	Course(String name, String description, int start, Day weekDay){
		this.name = name;
		this.description = description;
		this.startTime = start;
		this.weekDay = weekDay;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.description + " " + startTime
				+ " " + this.weekDay;
		
	}
	
	
	public String getCourseName() {
		return name;
	}
	public void setCourseName(String courseName) {
		this.name = courseName;
	}
	public String getCourseDescription() {
		return description;
	}
	public void setCourseDescription(String courseDescription) {
		this.description = courseDescription;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public Day getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(Day weekDay) {
		this.weekDay = weekDay;
	}
}
