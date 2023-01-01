public class StringIntern {
	public static void main(String args[]) {
		String s1 = "Java";
		String s2 = s1.intern();
		System.out.println(s1==s2);

		String s3 = "Python";
		String s4 = new String("Python");

		String s5 = s3.intern();
		String s6 = s4.intern();

		System.out.println(s5 == s3);
		System.out.println(s6 == s3);

		System.out.println(s6 ==s4);
	}
}