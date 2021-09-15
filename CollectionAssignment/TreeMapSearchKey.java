package CollectionAssignment;

import java.util.TreeMap;

public class TreeMapSearchKey {
	public static void main(String args[]) {
		TreeMap<Integer,String> name=new TreeMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Sid");
		name.put(103, "aman");
		name.put(104, "tushar");
		name.put(105, "sid");
		System.out.println("key value pair "+name);
		if(name.containsKey(103)) {
			System.out.println("at 103 -  "+name.get(103));
		}
		else {
			System.out.println("not present");
		}
}
}