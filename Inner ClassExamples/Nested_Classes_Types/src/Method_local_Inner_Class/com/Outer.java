package Method_local_Inner_Class.com;

public class Outer {
    void my_Method() {
        int num = 1001;

        class Inner {
            public void print() {
                System.out.println("This is Method local inner class");
            }
        }
        Inner inner = new Inner();
        inner.print();
    }
}
