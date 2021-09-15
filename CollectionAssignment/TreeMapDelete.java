  package CollectionAssignment;

import java.util.TreeMap;

public class TreeMapDelete {
	public static void main(String args[]) {
		TreeMap<Integer,String> name=new TreeMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Aman");
		name.put(103, "Sumit");
		name.put(104, "Sid");
		name.put(105, "prakhar");
		System.out.println("key value pair "+name);
		name.clear();
		System.out.println("after deletion "+name);
}
}