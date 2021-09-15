package CollectionAssignment;

import java.util.TreeMap;

public class TreeMapCopy {
	public static void main(String args[]) {
		TreeMap<Integer,String> name=new TreeMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Abhsihek");
		name.put(103, "Sid");
		name.put(104, "Sumit");
		name.put(105, "Shashwat");
		System.out.println("key value pair "+name);
		TreeMap<Integer,String> name1=new TreeMap<Integer,String>();
		name.put(106, "Raman");
		name.put(107, "Tushar");
		name.putAll(name1);
		System.out.println("after copy "+name);
}
}