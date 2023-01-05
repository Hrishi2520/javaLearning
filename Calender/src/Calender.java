import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to get Month Name: ");
        int num = scanner.nextInt();
        Calender.getMonthName(num);

        System.out.println("Enter month name to get days i month: ");
        scanner.nextLine();
        String month = scanner.nextLine();
        Calender.daysInMonth(month);
    }

    public static String getMonthName(int monthNum) {
        String monthName = "";
        switch (monthNum) {
            case 1: monthName = monthName.concat("January");
            break;
            case 2: monthName = monthName.concat("February");
            break;
            case 3: monthName = monthName.concat("March");
                break;
            case 4: monthName = monthName.concat("April");
                break;
            case 5: monthName = monthName.concat("May");
                break;
            case 6: monthName = monthName.concat("June");
                break;
            case 7: monthName = monthName.concat("July");
                break;
            case 8: monthName = monthName.concat("August");
                break;
            case 9: monthName = monthName.concat("September");
                break;
            case 10: monthName = monthName.concat("October");
                break;
            case 11: monthName = monthName.concat("November");
                break;
            case 12: monthName = monthName.concat("December");
                break;
            default:
                System.out.println("enter input in range 0 -12");
        }


        System.out.printf("%d is %S month\n", monthNum, monthName);
        return monthName;
    }

    public static int daysInMonth(String month) {
        int days=0;
        month = month.toLowerCase();
        switch(month) {
            case "jan":
                days = 31;
                break;
            case "feb":
                days = 28;
                break;
            case "march":
                days = 31;
                break;
            case "aipril":
                days = 31;
                break;
            case "may":
                days = 31;
                break;
            case "jun":
                days = 31;
                break;
            case "jul":
                days = 31;
                break;
            case "aug":
                days = 31;
                break;
            case "sept":
                days = 31;
                break;
            case "act":
                days = 31;
                break;
            case "nov":
                days = 31;
                break;
            case "dec":
                days = 31;
                break;
            default:
                System.out.println("Entered month is invalid");
        }
        System.out.printf("total days int %S are %d\n",month,days);
        return days;
    }

}