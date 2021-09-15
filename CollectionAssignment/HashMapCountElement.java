package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapCountElement {
	public static void main(String args[]) {
		Map<Integer,String> name=new HashMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "sid");
		name.put(103, "mayank");
		name.put(104, "sumit");
		name.put(105, "shashwat");
		System.out.println("key value pair "+name);
		System.out.println("number of elements "+name.size());
	}

}