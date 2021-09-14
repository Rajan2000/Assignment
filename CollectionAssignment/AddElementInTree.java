package CollectionAssignment;

import java.util.Set;
import java.util.TreeSet;

public class AddElementInTree {
	public static void main(String args[]) {
		Set<String> Fruit= new TreeSet<String>();
		
		Fruit.add("Apple");
		Fruit.add("Orange");
		Fruit.add("Strawberry");
		Fruit.add("Watermelon");
		Fruit.add("melon");
		Fruit.add("Papaya");
		System.out.println("Fruit "+Fruit);
		Set<String> Fruit1= new TreeSet<String>();
		Fruit1.add("Banana");
		Fruit1.add("Pineapple");
		Fruit.addAll(Fruit1);
		System.out.println("after adding elements to tree"+Fruit);

}
}