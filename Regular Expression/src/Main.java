import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        System.out.println(alphaNumeric.replaceAll("w[H][r]", "X"));

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

        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
        //quantifire example
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("h+j*i", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is paragraph about Something</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

//        String h2Pattern = ".*<h2>.*"; // . CHARACTER class will match every character and star means zero or more.
        String h2Pattern = "<h2>"; // . CHARACTER class will match every character and star means zero or more.
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence "+ count + " : "+ matcher.start()+ " to "+ matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());

        while (groupMatcher.find()) {
            System.out.println("Occurrence: "+ groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern  = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: "+h2TextMatcher.group(2));
        }
    }
}