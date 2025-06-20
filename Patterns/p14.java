public class p14 {

    public static void main(String[] args) {
        // ....*
        // ...*.*
        // ..*...*
        // .*.....*
        // ..*...*
        // ...*.*
        // ....*
        int n = 4;
        int till = 2 * n - 1 - 2;
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= Math.abs(row - n); col++) {
                System.out.print(" ");
            }
            if (row <= n) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    if (col == 1 || col == 2 * row - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int col = 1; col <= till; col++) {
                    if (col == 1 || col == till) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                till = till - 2;
            }

            System.out.println();
        }
    }
}