import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int p = 0;
        int i = 1;
        System.out.println(p);
        System.out.println(i);
        // Printing all the numbers in fibonacci series
        for (int count = 2; count <= n; count++) {
            int next = i + p;
            System.out.println(next);
            p = i;
            i = next;
        }

        // Printing nth fibonacci number

        int a = 0;
        int b = 1;
        int counter = 2;
        while (counter <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            counter++;
        }
        System.out.println("----" + b);

    }
}
