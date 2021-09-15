package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapSpecifiedValue {
	public static void main(String args[]) {
		Map<Integer,String> name=new HashMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Aman");
		name.put(103, "Sumit");
		name.put(104, "sid");
		name.put(105, "Gauri");
		System.out.println("key value pair "+name);
		  if (name.containsValue("Sumit")) {
		   
		   System.out.println("yes! - " );
		  } else {
		   
		   System.out.println("no!");
		  }

}
}