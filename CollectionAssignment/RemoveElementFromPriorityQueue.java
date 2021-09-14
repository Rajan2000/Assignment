package CollectionAssignment;
import java.util.PriorityQueue;

public class RemoveElementFromPriorityQueue {
	public static void main(String ag[]) {
		PriorityQueue<String> queue=new PriorityQueue<String>(); 
			queue.add("Blue");
			queue.add("black");
			queue.add("green");
			queue.add("maroon");
			queue.add("red");
			System.out.println("Queue: "+queue);
			queue.removeAll(queue);
			System.out.println("Queue: "+queue);
			
			
		
	}

}
