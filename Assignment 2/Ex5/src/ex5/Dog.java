package ex5;

class Dog extends Animal {
	Dog(String name, String gender, int age){
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setType("domesticated");
		this.setEnviroment("household");
		this.setSpeed(27);	
	}
	
	public void move() {
		System.out.println(this.getName() + " is moving");
	}
	
	public void eat() {
		System.out.println(this.getName() + " is eating");
	}
	
	public void sound() {
		System.out.println(this.getName() + " says woof");
	}
	
	public void sleep() {
		System.out.println(this.getName() + " is sleeping");
	}
	
	public void bark() {
		System.out.println(this.getName() + " is barking");
	}
	
	public void walk() {
		System.out.println(this.getName() + " is walking");
	}
	
	public void greetHuman() {
		System.out.println(this.getName() + " is playing with human");
	}
	
	public String toString() {
		return this.getName() + " is a dog";
	}
}
