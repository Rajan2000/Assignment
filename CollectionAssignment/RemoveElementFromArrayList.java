package CollectionAssignment;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to remove the third element from a array list.
public class RemoveElementFromArrayList {
	public static void main(String[] args) {
		  // Create a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("A");
		  list_Strings.add("B");
		  list_Strings.add("C");
		  list_Strings.add("D");
		  list_Strings.add("E");
		  // Print the list
		  System.out.println(list_Strings);
		  // Remove the third element from the list.
		  list_Strings.remove(2);
		  // Print the list again
		  System.out.println("After removing third element from the list:\n"+list_Strings);
		 }
		}
