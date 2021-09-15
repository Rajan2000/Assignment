package CollectionAssignment;

import java.util.TreeMap;

public class TreeMapLowAndHigh {
	public static void main(String args[]) {
		TreeMap<Integer,String> name=new TreeMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(132, "sid");
		name.put(129, "atif");
		name.put(184, "sid");
		name.put(135, "tushar");
		name.put(195, "raman");
		name.put(156, "ritik");
		System.out.println("key value pair "+name);
		System.out.println("highest key "+name.firstEntry());
		System.out.println("Lowest Key "+name.lastEntry());
}
}