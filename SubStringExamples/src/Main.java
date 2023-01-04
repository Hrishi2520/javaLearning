public class Main {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = str.substring(str.length());
        System.out.println(str1);
        System.out.println(str == str1);
        System.out.println("\n----------------------------------------------\n");

        String h1 = "hello";
        String h2 = h1.substring(0, 5);
        System.out.println(h2);
        System.out.println(h1 == h2);
        System.out.println("\n----------------------------------------------\n");

        String hello = "Hello";
        hello.hashCode();
        hello.hashCode();
        hello.hashCode();
        System.out.println(hello.hashCode());
        System.out.println(hello.hashCode());
        System.out.println(hello.hashCode());
    }
}