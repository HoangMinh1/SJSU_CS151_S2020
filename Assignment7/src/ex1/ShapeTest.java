package ex1;

import java.io.*;

class ShapeTest {

	public static void main(String[] args) {
		
		Shape obj = new Shape();
		//create shapes
		Triangle square_tria = new Triangle(2,5);
		Rectangle rec = new Rectangle(3,4);
		Circle big_cir = new Circle(2.5);
		Hexagon big_hex = new Hexagon(1.7);
		Triangle tria = new Triangle(4,1);
		Rectangle square = new Rectangle(4,4);
		Circle small_cir = new Circle(0.8);
		Hexagon small_hex = new Hexagon(0.7);
		//add
		obj.add(square_tria);
		obj.add(rec);
		obj.add(big_cir);
		obj.add(big_hex);
		obj.add(tria);
		obj.add(square);
		obj.add(small_cir);
		obj.add(small_hex);
		
		//another object
		Shape obj1 = new Shape();
		//create shapes
		Triangle square_tria1 = new Triangle(6,2);
		Rectangle rec1 = new Rectangle(3.5,4);
		Circle big_cir1 = new Circle(3.2);
		Hexagon big_hex1 = new Hexagon(2.9);
		Triangle tria1 = new Triangle(3,1);
		Rectangle square1 = new Rectangle(5,5);
		Circle small_cir1 = new Circle(0.9);
		Hexagon small_hex1 = new Hexagon(0.6);
		
		obj1.add(square_tria1);
		obj1.add(rec1);
		obj1.add(big_cir1);
		obj1.add(big_hex1);
		obj1.add(tria1);
		obj1.add(square1);
		obj1.add(small_cir1);
		obj1.add(small_hex1);
		
		//run threads
		System.out.print("First object: ");
		obj.start();
		
		System.out.print("Second object: ");
		obj1.start();
		

		//ex2
		Shape max = obj.max();
		Shape min  = obj.min();
		System.out.println("First Object Max is " + max);
		System.out.println("First Object Min is " + min);
		
		Shape max1 = obj1.max();
		Shape min1  = obj1.min();
		System.out.println("Second Object Max is " + max1);
		System.out.println("Second Object Min is " + min1);
		
		
		//ex3
		try {
			FileOutputStream streamOut = new FileOutputStream("./objec1.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(streamOut);
			objOut.writeObject(obj);
			System.out.println("First Object is serialized");
			objOut.close();
			streamOut.close();
			
			FileOutputStream streamOut1 = new FileOutputStream("./objec2.ser");
			ObjectOutputStream objOut1 = new ObjectOutputStream(streamOut1);
			objOut1.writeObject(obj1);
			System.out.println("Second Object is serialized");
			objOut1.close();
			streamOut1.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
