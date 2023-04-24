package challange;

public class Utilities {
    public char[] everyNthChar(char[] sourceArray, int n) {
        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length/n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n - 1; i < sourceArray.length; i += n) {
            result[index] = sourceArray[i];
        }
        return result;
    }

    //remove pairs of same character that are next to each other, by removing on e occurrencd of the character.
    //"ABBCDEEF" -> "ABCDEF"
    //aren't removed.
    public String removePairs(String source) {
        if (source == null || source.length() < 2) return source;

        StringBuilder sb = new StringBuilder();
        char[] ch = source.toCharArray();

        for (int i = 0; i < ch.length-1; i++) {
            System.out.println(ch[i]);
            if (ch[i] != ch[i+1]) {
                sb.append(ch[i]);
            }
        }

        sb.append(ch[ch.length -1]);
        return sb.toString();
    }

    //perform a conversion based on some internal business rule.
    public int converter(int a, int b) {
        return (a/b) + (a * 30) -2;
    }

    public String nullIfOddLength(String source) {
        return source.length() % 2 == 0 ? source : null;
    }
}
