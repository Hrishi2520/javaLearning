public class Main {
    public static void main(String[] args) {
        // Test Case 1:
        String str1 = "13:05";
        System.out.println(str1 + ": "
                + GFG.isValidTime(str1));

        // Test Case 2:
        String str2 = "02:15";
        System.out.println(str2 + ": "
                + GFG.isValidTime(str2));

        // Test Case 3:
        String str3 = "24:00";
        System.out.println(str3 + ": "
                + GFG.isValidTime(str3));

        // Test Case 4:
        String str4 = "10:60";
        System.out.println(str4 + ": "
                + GFG.isValidTime(str4));

        // Test Case 5:
        String str5 = "10:15 PM";
        System.out.println(str5 + ": "
                + GFG.isValidTime(str5));
    }
}