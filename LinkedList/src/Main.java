import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("sydney");
        placesToVisit.add(0, "canberra");
        System.out.println(placesToVisit);

        addElement(placesToVisit);
        System.out.println(placesToVisit);

//        removeElement(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);

//        printItinerary(placesToVisit);
//        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);
    }

    private static void addElement(LinkedList<String> list) {
        list.add("Darwin");
        list.add("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //stack
        list.push("Alice Springs");
    }

    private static void removeElement(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); //removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); //removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); //removes Last element
        System.out.println(s3 + " was removed");

        String p1 = list.poll();  //removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();  //removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();  //removes last element
        System.out.println(p3 + " was removed");
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element: "+ list.get(4));
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: "+ list.getLast());

        System.out.println("Darwin is at position: "+ list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: "+ list.lastIndexOf("Melbourne"));

        //Queue retrieval method
        System.out.println("Element from element() = "+ list.element());
        //stack retrieval element
        System.out.println("Element from peek(): "+ list.peek());
        System.out.println("Element from peekFirst(): "+ list.peekFirst());
        System.out.println("Element from peekLast(): "+ list.peekLast());
    }

    private static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at: "+ list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: "+list.get(i - 1) + " to "+ list.get(i));
        }
        System.out.println("Trip ends at: "+ list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at: "+ list.getFirst());
        String previous = list.getFirst();
        for (String current : list) {
            System.out.println("--> From: "+previous+ " to "+ current);
            previous = current;
        }
        System.out.println("Trip ends at: "+ list.getLast());
    }

    private static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at: "+ list.getFirst());
        String previous = list.getFirst();
        ListIterator<String> itr = list.listIterator(1);
        while(itr.hasNext()) {
            var current = itr.next();
            System.out.println("--> From: "+previous+ " to "+ current);
            previous = current;
        }
        System.out.println("Trip ends at: "+ list.getLast());
    }
}