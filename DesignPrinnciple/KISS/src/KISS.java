public class KISS {
    public static void main(String[] args) {
        try {
            System.out.println(weekday(7));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String weekday(int day) throws Exception {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thurday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new Exception("day must be in range 1 to 7");
        }
    }
}