package CollectionAssignment;
import java.util.PriorityQueue;

public class OneQueueToAnotherQueue {
	public static void main (String ag[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Blue");
		queue.add("Red");
		queue.add("Black");
		queue.add("Violet");
		System.out.println("PriorityQueue1 : "+queue);
		PriorityQueue<String> queue2 = new PriorityQueue<String>();
		queue2.add("orange");
		queue2.add("green");
		queue2.add("purple");
		queue2.add("Violet");
		System.out.println("Priority queue1 :"+queue2);
		queue2.addAll(queue);
		System.out.println("Combined Queue 2"+queue2);
		
		
	}

}
