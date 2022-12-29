package StaticNestedClass.com;

public class Outer {
    static class Nested_Test {
        public void my_method() {
            System.out.println("this is nested inner class");
        }
    }

    public static void main(String[] args) {
        Outer.Nested_Test nested = new Outer.Nested_Test();
        nested.my_method();
    }
}
