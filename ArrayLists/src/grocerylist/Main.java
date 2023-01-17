package grocerylist;

import java.util.ArrayList;

record GroceryItem(String name, int count) {
    public GroceryItem(String name) {
        this(name, 1);
    }

    @Override
    public String toString() {
        return String.format("%s quantity is: %d ", name.toUpperCase(), count);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(new GroceryItem("Butter"));
        obj.add(new GroceryItem("Milk"));
        obj.add("Yogurt");

        //initialising Arraylist of type GroceryItems..
        ArrayList<GroceryItem> groceryItems = new ArrayList<>();

        //adding elements in groceryItems.
        groceryItems.add(new GroceryItem("apple", 12));
        groceryItems.add(new GroceryItem("greps", 20));
        groceryItems.add(new GroceryItem("avocado", 5));
        groceryItems.add(new GroceryItem("banana", 6));
        groceryItems.add(0, new GroceryItem("pear", 10));

        //removing index 1 element from groceryItems.
        groceryItems.remove(1);
        System.out.println(groceryItems);
    }
}