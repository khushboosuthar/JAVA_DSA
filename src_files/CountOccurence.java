import java.util.Scanner;

public class CountOccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a number and count for 3 :");
        int num = sc.nextInt();

        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            if (rem == 5) {
                count++;
            } else {
                continue;
            }
        }
        System.out.println(count);
    }
}