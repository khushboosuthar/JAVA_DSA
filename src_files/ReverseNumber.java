import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        int num = number;

        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            reverse = reverse * 10 + rem;
        }
        System.out.println("Reverse of " + number + " is :" + reverse);
    }
}
