package Anonymous_Inner_Class.com;
public class Outer_class {

    public static void main(String args[]) {
        Anonymous inner = new Anonymous() {
            public void mytest() {
                System.out.println("This is an example of anonymous inner test class");
            }
        };
        inner.mytest();
    }
}
