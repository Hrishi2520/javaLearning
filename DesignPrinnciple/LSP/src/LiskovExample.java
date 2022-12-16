public class LiskovExample {
    public static class MenuItem {
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        double getDiscount() {
            return 0;
        }
    };

    public static class BeverageItem extends MenuItem {
        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }

        public double getPrice()
        {
            return this.price - this.getDiscount();
        }
        public double getDiscount(int discount) {
            discount = 10;
            return discount * .01 * this.price;
        }
    };

    public static void printItemPrice(MenuItem item) {
        if (item instanceof BeverageItem) {
            System.out.println("BeverageItem Price: ");
        } else {
            System.out.println("MenuItem Price: ");
        }
        System.out.println(item.getPrice());
    }

    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem(100, "Bread", "wheat flour bread");
        BeverageItem beverageItem = new BeverageItem(60, "Coke", "cold beverage");

        printItemPrice(menuItem);
        printItemPrice(beverageItem);
    }
}
