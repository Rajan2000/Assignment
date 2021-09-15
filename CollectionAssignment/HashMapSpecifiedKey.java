package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapSpecifiedKey {
	public static void main(String args[]) {
		Map<Integer,String> name=new HashMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Aman");
		name.put(103, "sid");
		name.put(104, "sumit");
		name.put(105, "rohit");
		System.out.println("key value pair "+name);
		System.out.println(" Is key 105 exists?");
		  if (name.containsKey(105)) {
		   
		   System.out.println("yes! - " + name.get(105));
		  } else {
		   
		   System.out.println("no!");
		  }
}
}