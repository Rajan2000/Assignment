package CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAndRemoveArray {
	public static void main(String args[]) {
	List<Integer> arraylist1=new ArrayList<Integer>();
		arraylist1.add(7);
		arraylist1.add(2);
		arraylist1.add(9);
		arraylist1.add(1);
		System.out.println("array list"+arraylist1);
		Collections.sort(arraylist1);
		System.out.println("sorted list "+arraylist1);
		
		//remove element in array
		arraylist1.remove(3);
		System.out.println("after removing "+arraylist1);
	}

}