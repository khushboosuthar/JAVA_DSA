public class p1 {
    public static void main(String args[]) {
        // Right half pyramid
        // *
        // * *
        // * * *
        // * * * *
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        // * * * *
        // * * *
        // * *
        // *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}