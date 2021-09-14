package Collections;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkListDemo {

	public static void main(String[] args) {

		// merging of two arrays
		List<String> list1 = new LinkedList<String>(); //LinkList

		list1.add("Sidhant");
		list1.add("Sumitesh");

		ArrayList<String> arrlist2 = new ArrayList<String>();

		arrlist2.add("Shashwat");
		arrlist2.add("Brijesh");
		arrlist2.add("Nidhi");
		arrlist2.add("Rajan");
		arrlist2.add("Vikas");

		arrlist2.addAll(list1);

		Iterator itr = arrlist2.iterator();

		while (itr.hasNext()) {

			System.out.println("This is " + itr.next());

		}

	}

}