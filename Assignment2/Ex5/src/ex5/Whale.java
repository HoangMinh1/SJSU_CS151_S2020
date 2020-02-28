package ex5;

class Whale extends Animal{
	
	Whale(String name, String gender, int age){
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setType("swimmer");
		this.setEnviroment("water");
		this.setSpeed(12);
	}
	
	public void move() {
		System.out.print(this.getName() + " is moving");
	}
	
	public void eat() {
		System.out.println(this.getName() +" is eating");
	}
	
	public void sleep() {
		System.out.println(this.getName() + " is sleeping");
	}
	
	public void sound() {
		System.out.println(this.getName() + " is making sound");
	}
	
	public void swim() {
		System.out.println(this.getName() + " is swimming");
	}
	public String toString() {
		return this.getName() + " is a whale";
	}

}
