package ex5;

class Cat extends Animal {
	Cat(String name, String gender, int age){
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setType("domesticated");
		this.setEnviroment("household");
		this.setSpeed(30);
	}
	
	public void move() {
		System.out.println(this.getName() + " is moving");
	}
	
	public void sound() {
		System.out.println(this.getName() + " sounds meow");
	}
	
	public void eat() {
		System.out.println(this.getName() + " is eating fish");
	}
	
	public void sleep() {
		System.out.println(this.getName() + " is sleeping");
	}
	
	public void walk() {
		System.out.println(this.getName() + " is walking");
	}
	
	public void greetHuman() {
		System.out.println(this.getName() + " is playing with human");
	}
	
	public void scratch() {
		System.out.println(this.getName() + " is scratching");
	}
	public String toString() {
		return this.getName() + " is a cat";
	}
}
