package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArralistAddAllMethodDemo {

	public static void main(String[] args) {

		// merging of two arrays
		ArrayList<String> arrlist1 = new ArrayList<String>();

		arrlist1.add("Rajan");
		arrlist1.add("Sidhant");

		ArrayList<String> arrlist2 = new ArrayList<String>();

		arrlist2.add("Sumitesh");
		arrlist2.add("Brijesh");
		arrlist2.add("Shashwat");
		arrlist2.add("Nidhi");
		arrlist2.add("Harshit");

		arrlist2.addAll(arrlist1);

		Iterator itr = arrlist2.iterator();

		while (itr.hasNext()) {

			System.out.println("This is " + itr.next());

		}

	}

}