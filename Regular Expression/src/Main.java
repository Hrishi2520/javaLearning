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

        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        //[^abc]
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMacher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMacher.find()) {
            count++;
            System.out.println("Occurrence: "+ count+ " : "+ tNotVMacher.start() + " to "+ tNotVMacher.end());
        }
        // ^({[\(]{1}[0-9]{3}{\)]{1}[]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890"; //should'nt match
        String phone2 = "(123) 456-7890"; //should match
        String phone3 = "123 456-7890";
        String phone4 = "(123)456-7890";

        System.out.println("phone1 = "+phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone1 = "+phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone1 = "+phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone1 = "+phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        // ^4[0-9]{12}([0-9]{3})?$
        String visa1 = "4444444444444";
        String visa2 = "5444444444444";
        String visa3 = "4444444444444444";
        String visa4 = "4444";

        System.out.println("visa1 "+ visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 "+ visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 "+ visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 "+ visa4.matches("^4[0-9]{12}([0-9]{3})?$"));
    }
}