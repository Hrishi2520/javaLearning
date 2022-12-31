public class StringBasic {
	public static void main(String[] args) {
		String s1= "Arpan";

		String s2 = "Arpan";

		String s3 = s1;

		String s4 = new String("Arpan");
		String s5 = new String("Banerjee");

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println(s4==s5);
	}
}