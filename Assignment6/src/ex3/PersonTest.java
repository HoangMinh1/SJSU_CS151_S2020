package ex3;

import java.util.*;

class PersonTest {

	public static void main(String[] args) {
		ArrayList<Person> mList = new ArrayList<Person>();
		
		mList.add(new Person("Joe", "Smith", 40));
		mList.add(new Person("Amy", "Gold", 32));
		mList.add(new Person("Tony", "Stork",21));
		mList.add(new Person("Sean", "Irish",24));
		mList.add(new Person("Tina", "Brock",28));
		mList.add(new Person("Lenny", "Hep",18));
		
		//Using comparator
		Comparator<Person> sortByAge = Comparator.comparing(Person::getAge);
		Comparator<Person> sortByFirstName = Comparator.comparing(Person::getFirstName);
		Comparator<Person> sortByLastName = Comparator.comparing(Person::getLastName, (s1, s2) -> {
			return s2.length() - s1.length();});
		Comparator<Person> sortByLastNameR = Comparator.comparing(Person::getLastName, (s1, s2) -> {
			return s1.length() - s2.length();});
		
		
		//Sort and print result
		System.out.println("Sort by age: ascending order");
		mList.sort(sortByAge);
		for(Person p : mList)
			System.out.println(p);
		
		
		System.out.println("Sort by age: descending order");
		mList.sort(sortByAge.reversed());
		for(Person p : mList)
			System.out.println(p);
		
		
		System.out.println("Sort by firstName: ascending order");
		mList.sort(sortByFirstName);
		for(Person p : mList)
			System.out.println(p);
		
		
		System.out.println("Sort by firstName: descending order");
		mList.sort(sortByFirstName.reversed());
		for(Person p : mList)
			System.out.println(p);
		
		
		System.out.println("Sort by lastName: ascending order");
		mList.sort(sortByLastName);
		for(Person p : mList)
			System.out.println(p);
		
		
		System.out.println("Sort by lastName: descending order");
		mList.sort(sortByLastNameR);
		for(Person p : mList)
			System.out.println(p);
	}

}
