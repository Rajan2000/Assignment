package CollectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.IntFunction;

public class HashSetToList {
	public static void main(String args[]) {
		HashSet<String> str=new HashSet<String>();
		str.add("Raj");
		str.add("Sid");
		str.add("Ram");
		System.out.println("hashset "+str);
		List<String> str2=new ArrayList<String>(str);
		System.out.println("List");
		
			System.out.println(str2);
		
}
}