package CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpdateElementInArray {
	public static void main(String args[]) {
		List<String> list2=new ArrayList<String>();
		list2.add("Rajan");
		list2.add("Anurag");
		list2.add("Sidhant");
		list2.add("Brijesh");
		System.out.println("list "+list2);
		list2.set(3, "Sumitesh");
		System.out.println("updated list "+list2);
		

		boolean arr=list2.contains("Sumitesh");//searching whether element is in array or not
		if(arr) {
			System.out.println("contain");
		}
		else {
			System.out.println("not contain");
			
		}
		
		//reverse element
		Collections.reverse(list2);
		System.out.println("reverse list "+list2);
	}
	
}