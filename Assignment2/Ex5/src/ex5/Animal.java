package ex5;

abstract class Animal {
	private String type = "animals";
	private String name;
	private String gender;
	private int age;
	private String enviroment;
	private int speed;
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//getter
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getEnviroment() {
		return this.enviroment;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	
	interface Behavior{
		public abstract void move();
		public abstract void sound();
		public abstract void eat();
		public abstract void sleep();
		public String toString();
	}
}
