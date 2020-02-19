package ex5;

class Racoon extends Animal{
	Racoon(String name, String gender, int age){
		this.setType("mammal");
		this.setEnviroment("forest");
		this.setAge(age);
		this.setGender(gender);
		this.setName(name);
		this.setSpeed(11);
	}
	public void move() {
		System.out.println(this.getName() + " is moving");
	}
	
	public void sound() {
		System.out.println(this.getName() + " is making sound");
	}
	
	public void eat() {
		System.out.println(this.getName() + " is eating berries");
	}
	
	public void sleep() {
		System.out.println(this.getName() + " is sleeping");
	}
	
	public void scratch() {
		System.out.println(this.getName() + " is scratching");
	}
	public String toString() {
		return this.getName() + " is a racoon";
	}
}
