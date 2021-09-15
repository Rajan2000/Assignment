package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapIsEmpty {
	public static void main(String args[]) {
		Map<Integer,String> name=new HashMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Ram");
		name.put(103, "Sid");
		name.put(104, "Aman");
		name.put(105, "Garvit");
		System.out.println("key value pair "+name);
		
		boolean name1=name.isEmpty();
		System.out.println("hash map is empty "+name1);
}
}