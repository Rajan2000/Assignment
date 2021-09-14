package CollectionAssignment;
import java.util.PriorityQueue;

public class CompareTwoPriorityQueue {
	public static void main(String ag[]) {
		PriorityQueue<String> queue=new PriorityQueue<String>(); 
			queue.add("Blue");
			queue.add("black");
			queue.add("green");
			queue.add("maroon");
			queue.add("red");
			System.out.println("Queue1 : "+queue);
			PriorityQueue<String> queue2=new PriorityQueue<String>(); 
			queue2.add("Red");
			queue2.add("orange");
			queue2.add("purple");
			queue2.add("maroon");
			queue2.add("red");
			queue2.add("black");
			System.out.println("Queue2 : "+queue2);
			for (String element :queue) {
				System.out.println(queue2.contains(element)? "Yes":"No");
			}
			
	}
}