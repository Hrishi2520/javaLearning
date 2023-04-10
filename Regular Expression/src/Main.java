public class Main {
    public static void main(String[] args) {
        String string = "I am a String. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphaNumeric = "Hrishi36-25";
//        System.out.println(alphaNumeric.replaceAll(".", "Y"));

        System.out.println(alphaNumeric.replaceAll("^i", "*"));

        System.out.println(alphaNumeric.matches("^36"));

        System.out.println(alphaNumeric.replaceAll("36-25$", " 11"));

        System.out.println(alphaNumeric.replaceAll("[Hhi]", "X"));

        System.out.println(alphaNumeric.replaceAll("[H][r]", "X"));

        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphaNumeric = "Hrishi36-25";

        System.out.println(newAlphaNumeric.replaceAll("[^is]", "X"));

        System.out.println(newAlphaNumeric.replaceAll("[H-i3-5]", "X"));

        System.out.println(newAlphaNumeric.replaceAll("[1-5]", "X"));

        System.out.println(newAlphaNumeric.replaceAll("\\d", "X"));

        System.out.println(newAlphaNumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks and\ta tab, and also a newLine\n";

        System.out.println(hasWhitespace);

        System.out.println(hasWhitespace.replaceAll("\\s", ""));

        System.out.println(hasWhitespace.replaceAll("\t", ""));

        System.out.println(hasWhitespace.replaceAll("\\S", ""));

        System.out.println(newAlphaNumeric.replaceAll("\\w", "X"));

        System.out.println(hasWhitespace.replaceAll("\\w", "X"));

        System.out.println(hasWhitespace.replaceAll("\\b", "X"));
    }
}