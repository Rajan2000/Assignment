package CollectionAssignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapRemoveAllElement {
	public static void main(String args[]) {
		Map<Integer,String> name=new HashMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Aman");
		name.put(103, "manisha");
		name.put(104, "Sid");
		name.put(105, "Sumitesh");
		System.out.println("key value pair "+name);
		name.clear();
		System.out.println("empty "+name);
		

}
}