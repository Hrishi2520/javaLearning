package InnerClass.com;

public class Outer {
    int num;
    //inner class
    private class Inner {
        public void print() {
            System.out.println("This is an example of Inner class");
        }
    }

    void display() {
        Inner inner = new Inner();
        inner.print();
    }
}
