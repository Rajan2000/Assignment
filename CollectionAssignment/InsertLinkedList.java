package CollectionAssignment;

import java.util.LinkedList;

public class InsertLinkedList {
	public static void main(String args[]) {
		LinkedList<String> llist1=new LinkedList<String>();
		llist1.add("sumitesh");
		llist1.add("amritaksh");
		llist1.add("prakahr");
		llist1.add("Abhi");
		System.out.println("list "+llist1);
		
		//insert at specified position in linked list
		llist1.add(3, "mohit");
		System.out.println("after insert "+llist1);
		
		llist1.addFirst("aakash");//insert at first position in linked list
		System.out.println("insert at fisrt "+llist1);
		
		llist1.addLast("Ankush"); //insert at last position in linked list
		System.out.println("insert at last "+llist1);
	}

}