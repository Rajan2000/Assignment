package CollectionAssignment;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSort {
	public static void main(String args[]) {
		TreeMap<Integer,String> name=new TreeMap<Integer,String>();
		name.put(101, "Rajan");
		name.put(102, "Sid");
		name.put(109, "Anurag");
		name.put(107, "Ankit");
		name.put(105, "Garvit");
		System.out.println("key value pair "+name);
		
}
}
class sort_key implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1.compareTo(str2);
	}
	
}