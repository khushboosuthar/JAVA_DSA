import java.util.Scanner;

public class ReverseFibo {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Fibonacci series :");
        // Step 1 : Print fiboncci
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int count = 2; count <= num; count++) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.println(b);
        }

        System.out.println("Fibonacci series in Reverse order :");
        // while(a!=0)
        // {
        // System.out.println();
        // }
    }
}
