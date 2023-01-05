import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to get Month Name: ");
        int num = scanner.nextInt();
        Calender.getMonthName(num);

        System.out.println("\nEnter month name to get days in month: ");
        scanner.nextLine();
        String month = scanner.nextLine();
        Calender.daysInMonth(month);
    }

    public static void getMonthName(int monthNum) {
        switch (monthNum) {
            case 1:
                System.out.printf("Entered month number %d is January.\n", monthNum);
                break;
            case 2:
                System.out.printf("Entered month number %d is February.\n", monthNum);
                break;
            case 3:
                System.out.printf("Entered month number %d is March.\n", monthNum);
                break;
            case 4:
                System.out.printf("Entered month number %d is April.\n", monthNum);
                break;
            case 5:
                System.out.printf("Entered month number %d is May.\n", monthNum);
                break;
            case 6:
                System.out.printf("Entered month number %d is June.\n", monthNum);
                break;
            case 7:
                System.out.printf("Entered month number %d is July.\n", monthNum);
                break;
            case 8:
                System.out.printf("Entered month number %d is August.\n", monthNum);
                break;
            case 9:
                System.out.printf("Entered month number %d is September.\n", monthNum);
                break;
            case 10:
                System.out.printf("Entered month number %d is October.\n", monthNum);
                break;
            case 11:
                System.out.printf("Entered month number %d is November.\n", monthNum);
                break;
            case 12:
                System.out.printf("Entered month number %d is December.\n", monthNum);
                break;
            default:
                System.out.println("enter input in range 1 - 12");
        }
    }

    public static int daysInMonth(String month) {
        int days=0;
        month = month.toLowerCase();
        switch(month) {
            case "january":
                days = 31;
                break;
            case "february":
                days = 28;
                break;
            case "march":
                days = 31;
                break;
            case "april":
                days = 31;
                break;
            case "may":
                days = 31;
                break;
            case "jun":
                days = 31;
                break;
            case "july":
                days = 31;
                break;
            case "august":
                days = 31;
                break;
            case "september":
                days = 31;
                break;
            case "october":
                days = 31;
                break;
            case "november":
                days = 31;
                break;
            case "december":
                days = 31;
                break;
            default:
                System.out.println("Entered month is invalid");
        }
        System.out.printf("total days int %S are %d\n",month,days);
        return days;
    }

}
