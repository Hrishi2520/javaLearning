import java.util.*;
public class LinkedlistExample {
	public static void main(String args[]) {
		LinkedList <String> al = new LinkedList <String>();
		al.add("Ashish");
		al.add("Bhavesh");
		al.add("Ketan");
		al.add("Hrishi");

		Iterator <String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}