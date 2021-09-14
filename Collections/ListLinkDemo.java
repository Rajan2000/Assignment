package Collections;


import java.util.Iterator;
import java.util.LinkedList;


public class ListLinkDemo {

	public static void main(String[] args) {

		LinkedList<String> arrlist2 = new LinkedList<String>(); // LinkListDemo

		arrlist2.add("Sumitesh");
		arrlist2.add("Sid");
		arrlist2.add("Harshit");
		arrlist2.add("Prateek");
		arrlist2.add("Ankit");

		Iterator itr = arrlist2.iterator();

		while (itr.hasNext()) {

			System.out.println("This is " + itr.next());

		}

	}

}