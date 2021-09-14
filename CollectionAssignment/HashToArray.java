package CollectionAssignment;

import java.util.HashSet;

public class HashToArray {
	public static void main(String args[]) {
		HashSet<String> str=new HashSet<String>();
		str.add("Rajan");
		str.add("Sumit");
		str.add("Sidd");
		str.add("Brijesh");
		System.out.println("hashset "+str);
		String[] newarr= new String[str.size()];
		str.toArray(newarr);
		
		System.out.println("newarrray: ");
		for(String element:newarr) {
			System.out.println(element);
		}
	}

}