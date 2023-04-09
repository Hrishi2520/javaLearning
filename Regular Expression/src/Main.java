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
    }
}