package CollectionAssignment;

import java.util.LinkedList;

public class AppendElementLinkedList {
	public static void main(String args[]) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Rajan");
		list.add("Arjun");
		list.add("Kanishka");
		System.out.println("linked list "+list);
		list.addLast("Siddhant");
		System.out.println("after append "+list );
	}

}