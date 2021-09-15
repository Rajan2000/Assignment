package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapCopyToAnother {
	public static void main(String args[]) {
		Map<Integer,String> name=new HashMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Anurag");
		name.put(103, "sid");
		name.put(104, "Abhinav");
		name.put(105, "Sumit");
		System.out.println("key value pair "+name);
		
		Map<Integer,String> name1=new HashMap<Integer,String>();
		name1.put(106, "Anu");
		name1.put(107, "Aman");
		name1.put(108, "manisha");
		name1.putAll(name);
		System.out.println("after copying "+name1);
		
	}


}