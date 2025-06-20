public class p7 {
    public static void main(String[] args) {
        // ..1..
        // .121.
        // 12321
        // 12321
        // .121.
        // ..1..
        int n = 8;
        int rn = n - 1;
        int till = 2 * n - 2;
        for (int row = 1; row <= 2 * n - 1; row++) {
            int prn = 2 * n - row - 1;
            if (row <= n) {
                for (int col = 1; col <= n - row; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print(col);
                }
                int pn = row - 1;
                for (int col = 1; col <= pn; col++) {
                    System.out.print(row - col);
                }
            } else {
                for (int col = 1; col <= row - n; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= rn; col++) {
                    System.out.print(col);
                }
                for (int col = n + 1; col <= till; col++) {
                    System.out.print(prn);
                    prn--;
                }
                rn--;
                till--;
            }
            System.out.print("\n");
        }
    }
}
