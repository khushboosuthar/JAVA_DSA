public class p9 {
    public static void main(String[] args) {
        // *******
        // ***.***
        // **...**
        // *.....*
        int n = 8;
        int m = 1;
        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                for (int col = 1; col <= 2 * n - 1; col++) {
                    System.out.print("*");
                }
            } else {
                for (int col = 1; col <= n - row + 1; col++) {
                    System.out.print("*");
                }
                int till = 2 * m - 1;
                for (int col = 1; col <= till; col++) {
                    System.out.print(" ");
                }
                m++;
                for (int col = 1; col <= n - row + 1; col++) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
