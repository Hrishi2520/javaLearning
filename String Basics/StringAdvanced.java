public class StringAdvanced {
	public static void main(String[] args) {
		String s1 = new String("Java");

		string s2 = s1;

		System.out.println(s2 == s1);

		String s3 = "Java";

		System.out.println(s3 == s1);

		System.out.println(s3 == s2);

		String s4 = "Program";

		String s5 = s4;

		String s6 = new String(s5);

		System.out.println(s5 == s4);
		System.out.println(s6 == s5);

		s1 = "Python";
		System.out.println(s2 == s1);

		s5.concat("javaScript");
		System.out.println(s6 == s5);
	}
}