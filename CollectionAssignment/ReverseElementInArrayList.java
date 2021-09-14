package CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to reverse elements in a array list.
public class ReverseElementInArrayList {
	public static void main(String[] args) {
		  // Create a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("A");
		  list_Strings.add("B");
		  list_Strings.add("C");
		  list_Strings.add("D");
		  list_Strings.add("E");
		  System.out.println("List before reversing :\n" + list_Strings);  
		  Collections.reverse(list_Strings);
		  System.out.println("List after reversing :\n" + list_Strings); 
		 }

}