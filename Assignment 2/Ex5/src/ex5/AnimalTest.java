package ex5;

class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat kitty = new Cat("kitty", "female", 5);
		System.out.println(kitty);
		kitty.eat();
		kitty.move();
		kitty.sound();
		kitty.sleep();
		kitty.scratch();
		kitty.walk();
		kitty.greetHuman();
		System.out.println();
		
		Dog puppy = new Dog("puppy", "male", 7);
		System.out.println(puppy);
		puppy.eat();
		puppy.bark();
		puppy.move();
		puppy.sound();
		puppy.walk();
		puppy.sleep();
		puppy.greetHuman();
		System.out.println();
		
		Racoon tom = new Racoon("tom", "male", 10);
		System.out.println(tom);
		tom.eat();
		tom.move();
		tom.sleep();
		tom.sound();
		tom.scratch();
		System.out.println();
		
		Whale dacy = new Whale("dacy", "female", 8);
		System.out.println(dacy);
		dacy.eat();
		dacy.move();
		dacy.sleep();
		dacy.sound();
		dacy.swim();
		System.out.println();
	}

}
