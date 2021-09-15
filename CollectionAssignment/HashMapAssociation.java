package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapAssociation {
	public static void main(String args[]) {
		Map<Integer,String> name=new HashMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Sid");
		name.put(103, "Anurag");
		name.put(104, "Ram");
		System.out.println("key value pair "+name);
		
	}

}