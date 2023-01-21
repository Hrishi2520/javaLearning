package LinkedListChallenge;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(places, adelaide);
        addPlace(places, new Place("brisbane", 193));
        addPlace(places, new Place("vashi", 235));
        addPlace(places, new Place("ghansoli", 314));
        addPlace(places, new Place("kolkataf", 2301));
        addPlace(places, new Place("kolkataf", 2301));
        System.out.println(places);

        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        getActions();
        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: "+iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: "+iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String str = scanner.nextLine().toUpperCase().substring(0,1);
            switch (str) {
                case "F" :
                    System.out.println("User wants to go forward");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext())
                        System.out.println(iterator.next());
                    break;
                case "B" :
                    System.out.println("User wants to go backward");
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious())
                        System.out.println(iterator.previous());
                    break;
                case "M":
                    getActions();
                    break;
                case "L":
                    System.out.println(places);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
//        if (list.contains(place)) {
//            System.out.println("Found duplicate: "+ place);
//            return;
//        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: "+ place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);

    }
    private static void getActions() {
        System.out.println("""
                Available Actions (select word  or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
