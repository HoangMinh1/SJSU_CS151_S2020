package ex1;

import java.util.*;



class ListManipulator {
	
	public ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending){
		if(ascending)
			myLst.sort(new sortAscending());
		else
			myLst.sort(new sortDescending());
		return myLst;
	}
	
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
		int minIndex = 0;
		int maxIndex = 0;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int index = 0; index < myLst.size(); index++) {
			int num = myLst.get(index);	
			
			if(num < min) 
				minIndex = index;
			else if(num > max)
				maxIndex = index;	
			min = myLst.get(minIndex);
			max = myLst.get(maxIndex);
		}
		/*swap value */
		myLst.set(maxIndex, min);
		myLst.set(minIndex, max);
		
		return myLst;
	}
	
	public void table(ArrayList<Integer> myLst) {
		Hashtable<Integer, Integer> myTable = new Hashtable<Integer, Integer>();
		for(Integer num : myLst) {
			if(!myTable.containsKey(num))
				myTable.put(num, 1);
			else
				myTable.put(num, myTable.get(num) + 1);
		}
		System.out.println("Value\t Frequency");
		myTable.forEach((num, freq) -> System.out.println(num + "\t    " + freq));
	}
	
	/*Comparator helper class*/
	class sortAscending implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		}
		
	}
	class sortDescending implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
		
	}

}
