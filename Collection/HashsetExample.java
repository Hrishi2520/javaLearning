import java.util.*;
class HashsetExample {
	public static void main(String args[]) {
		HashSet<String> al = new HashSet();
		al.add("Rachit");
		al.add("Amit");
		al.add("jack");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.Next());
		}
	}
}