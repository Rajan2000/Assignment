package CollectionAssignment;
import java.util.PriorityQueue;

public class InsertElementInPriorityQueue {
	public static void main(String ag[]) {
		PriorityQueue<String> queue=new PriorityQueue<String>(); 
			queue.add("Blue");
			queue.add("black");
			queue.add("green");
			queue.add("maroon");
			queue.add("red");
			System.out.println("Queue1: "+queue);
			queue.add("Grey");
			System.out.println("Queue after adding"+queue);
			
		
	}

}
