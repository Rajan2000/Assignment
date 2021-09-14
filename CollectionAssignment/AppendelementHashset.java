package CollectionAssignment;

import java.util.HashSet;
import java.util.Iterator;

public class AppendelementHashset {
	public static void main(String args[]) {
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(9);
		set1.add(3);
		set1.add(6);
		set1.add(1);
		set1.add(8);
		System.out.println("hash set "+set1);
		
		//iterate through all elemnt in hashset
		Iterator itr0=set1.iterator();
		while(itr0.hasNext()) {
			System.out.println(itr0.next());
		}
		
		//number of element in hash set
		System.out.println("number of element "+set1.size());
		
	// check whetether hash set is empty or not
		boolean set=set1.isEmpty();
		if(set) {
			System.out.println("empty");
		
		}
		else {
			System.out.println("not empty");
		}
		// clone one hashset to another hashset
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2=(HashSet)set1.clone();
		System.out.println("clone "+set2);
		
		
		
	}

}