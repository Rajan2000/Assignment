package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSetView {
	public static void main(String args[]) {
		Map<Integer,String> name=new HashMap<Integer,String>();
		name.put(101, "Atif");
		name.put(102, "Rajan");
		name.put(103, "mayank");
		name.put(104, "rohit");
		name.put(105, "pankaj");
		System.out.println("key value pair "+name);
		
		Set set=name.entrySet();
		System.out.println("hash map set "+set);
}
}