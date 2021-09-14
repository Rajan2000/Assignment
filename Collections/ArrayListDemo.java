package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("Rajan");
		arrlist.add("Sid");
		arrlist.add("Mohit");
		arrlist.add("Ajay");
		arrlist.add("Aman");

		Iterator itr = arrlist.iterator();

		while (itr.hasNext()) {

			System.out.println("This is " + itr.next());

		}

	}

}