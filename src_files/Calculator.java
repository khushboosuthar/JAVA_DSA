import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the operator ( + , - , / , * ) :");
            char oper = sc.next().trim().charAt(0);
            int result = 0;

            if (oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%') {
                System.out.println("Enter two numbers :");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (oper == '+') {
                    result = num1 + num2;
                }
                if (oper == '-') {
                    result = num1 - num2;
                }
                if (oper == '*') {
                    result = num1 * num2;
                }
                if (oper == '/') {
                    result = num1 / num2;
                }
                if (oper == '%') {
                    result = num1 % num2;
                }
            } else if (oper == 'x' || oper == 'X') {
                break;
            } else {
                System.out.println("Enter valid operator.s");
            }
            System.out.println("Result is :" + " " + result);
        }
    }
}
