import java.util.*;
public class PriorityQueueExample{
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Mango");
		queue.add("Avacado");
		queue.add("Cherry");
		queue.add("Banana");

		System.out.println("head: "+ queue.element());
		System.out.println("head: "+ queue.peek());

		System.out.println("iterating the queue elements:");
		Iterator itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}