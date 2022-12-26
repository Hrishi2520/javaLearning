import java.util.*;
class ArrayListExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Jack");
		al.add("Tyler");
		al.add("Hrishi");

		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}