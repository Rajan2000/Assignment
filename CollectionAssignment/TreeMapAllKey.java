package CollectionAssignment;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapAllKey {
	public static void main(String args[]) {
		TreeMap<Integer,String> name=new TreeMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Sid");
		name.put(103, "aman");
		name.put(104, "Abhinav");
		name.put(105, "pankaj");
		name.put(106, "prakhar");
		System.out.println("key value pair "+name);
		Set<Integer> set=name.keySet();
		for(Integer element:set) {
			System.out.println("keys are "+element);
		}

}
}