import java.util.Scanner;

public class SwitchDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number according to day :");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter valid day");
        }

        System.out.println("enter your input :");
        int input = sc.nextInt();

        switch (input) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Enter valid number");
        }

    }
}