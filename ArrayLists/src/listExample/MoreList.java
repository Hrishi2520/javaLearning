package listExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println("list items: "+list);
        //checking is banana present in list.
        if (list.contains("bananas")) {
            System.out.println("List contains bananas");
        }

        ArrayList<String> groceries = new ArrayList<>(list);
        //adding elements in groceries
        groceries.add("yogurt");
        groceries.add("lemon");
        groceries.add("yogurt");
        System.out.println("groceries items: "+groceries);
        //adding list elements in groceries.
//        groceries.addAll(list);
        //remover third index from groceries
        groceries.remove(3);
        System.out.println("removing 3rd index element from groceries: "+groceries);

        groceries.remove("yogurt");
        System.out.println("groceries after removing yogurt: "+groceries);
        System.out.println("first index of yogurt: "+ groceries.indexOf("yogurt"));
        System.out.println("index of yogurt: "+ groceries.lastIndexOf("yogurt"));

        groceries.clear();
        System.out.println("after clearing elements from groceries: "+groceries);
        System.out.println("is groceries Empty: \n"+ groceries.isEmpty());

        //adding element to groceries
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println("Elements from groceries: \n"+groceries);

        //sorting by natural order in groceries
        groceries.sort(Comparator.naturalOrder());
        System.out.println("After sorting groceries: \n"+groceries);

        //sorting in reverse natural order
        groceries.sort(Comparator.reverseOrder());
        System.out.println("after reverse sorting groceries: \n"+ groceries);

        //creating array from groceries arraylist
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println("groceryArray elements: \n"+Arrays.toString(groceryArray));

        //creating arraylist of days
        ArrayList<String> days = new ArrayList<>(List.of("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
        System.out.println("Print Days: \n"+days);


    }
}
