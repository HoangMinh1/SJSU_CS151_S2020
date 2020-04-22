package ex4;
import java.util.*;

class MethodTest {

	public static <T> int count (ArrayList<T> arr, <T> type) {
		int count = 0;
		for(type e :  arr) {
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("Hello");
		arr.add("World");
		arr.add("This is CS151");
		arr.add("Coding is fun");
		arr.add("But homework is hard");
		
		arr.add(3);
		arr.add(5);
		arr.add(1);
		arr.add(6);
		arr.add(4);
		arr.add(8);
		
		arr.add(3.3);
		arr.add(5.7);
		arr.add(1.3);
		arr.add(6.9);
		arr.add(4.6);
		arr.add(8.6);
		arr.add(4.2);
		arr.add(8.1);
		
		
		System.out.println("Number of Type String: " + MethodTest.count(arr, Double));
		System.out.println("Number of Type String: " + MethodTest.count(arr, String));
		System.out.println("Number of Type String: " + MethodTest.count(arr, Integer));
	}
	

}
