package Collections;

import java.util.List;
import java.util.Vector;

//Vector is synchronized.
//Java Vector contains many legacy methods that are not the part of a collections framework.
public class VectorDemo {

	public static void main(String ar[]) {
		
		List<String> vect= new Vector<String>();
		
				vect.add("Sid");
				vect.add("Raj");
				vect.add("Brijesh");
				vect.add("Shashwat");
				vect.add("Rohit");
				
				System.out.println(vect);
		
		
	}
}