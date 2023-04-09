public class Main {
    public static void main(String[] args) {
        String string = "I am a String. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphaNumeric = "ajacjksma123132";
//        System.out.println(alphaNumeric.replaceAll(".", "Y"));

        System.out.println(alphaNumeric.replaceAll("^ajacjksma", "I am"));

        System.out.println(alphaNumeric.matches("^hello"));

        System.out.println(alphaNumeric.replaceAll("123132$", " you!"));

        System.out.println(alphaNumeric.replaceAll("[aei]", "X"));

        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "X"));
    }
}