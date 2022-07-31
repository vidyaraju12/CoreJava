package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1= {"abc", "pqr", "xyz", "aab", "bba"}; // This is size is limited
		
		ArrayList<String> list1 = new ArrayList<String>();  // no size restriction, its dynamic
		
		list1.add("John");
		list1.add("Leena");
		list1.add("vidya");
		list1.add("Aditri");
		list1.add("xyz");
		
		System.out.println("List is this " + list1);
		
		System.out.println("Size of Array List is " + list1.size());
		
		list1.remove(1);  //remove Leena from the array list
		
        System.out.println("List is this " + list1);
		
		System.out.println("Size of Array List is " + list1.size());
		System.out.println("The data at 4th position is " +list1.get(3));
		list1.set(0, "James");
		
		System.out.println("The new list after replacing John is " + list1);
		
		list1.add(1, "Leena");
		
		System.out.println("List after adding Leena again is " +list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>(); 
		list2.add(123);
		list2.add(456);
		
		System.out.println("Print Integer is " + list2);
		
		Collections.sort(list1);
		
		System.out.println("List after sorting " +list1);
		
		// how to list in descending order
		
		for(int index=0; index<list1.size(); index++) {
			if(list1.get(index).equals("vidya")){
				System.out.println(index);
				break;
			}
			//System.out.println("Name is Leena at index "+);
			System.out.println(list1.get(index));
		}
		
		for(String name:list1) {
			System.out.println(name);				
			
		}
		
		Collections.reverse(list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		
		System.out.println("The list after reverse is " +list1);
		
		
	}

}
