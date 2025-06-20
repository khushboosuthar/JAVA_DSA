public class p8 {
    public static void main(String[] args) {
        // Diamond Shape
        // ..*..
        // .***.
        // *****
        // .***.
        // ..*..
        int n = 3;
        int till = n;
        int until = 2 * n - 2;
        for (int row = 1; row <= 2 * n - 1; row++) {
            if (row <= n) {
                for (int col = 1; col <= n - row; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                for (int col = n; col < till; col++) {
                    System.out.print("*");
                }
                till++;
            } else {
                for (int col = 1; col <= row - n; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col < until; col++) {
                    System.out.print("*");
                }
                until = until - 2;
            }
            System.out.print("\n");
        }
        // ****
        // *..*
        // *..*
        // ****
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("*");
                }
            } else {
                for (int col = 1; col <= n; col++) {
                    if (col == 1 || col == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
