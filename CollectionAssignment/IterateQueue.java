package CollectionAssignment;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IterateQueue {
	public static void main (String ag[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Blue");
		queue.add("Red");
		queue.add("Black");
		queue.add("Violet");
		System.out.println("Queue "+queue);
		Iterator itra=queue.iterator();
		System.out.println("iterate: ");
		while (itra.hasNext()) {
			System.out.println(itra.next());
		}
	}

}
