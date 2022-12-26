import java.util.*;
class LinkedHashsetExample {
	public static void main (String args[]) {
		LinkedHashSet<String> names = new LinkedHashSet();
		names.add("Vishal");
		names.add("abrar");
		names.add("kunal");

		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}