public class p11 {
    public static void main(String[] args) {
        // 123454321
        // 1234.4321
        // 123...321
        // 12.....21
        // 1.......1
        int n = 5;
        int m = 1;
        for (int row = 1; row <= n; row++) {
            int l = n;
            if (row == 1) {
                for (int col = 1; col <= n - 1; col++) {
                    System.out.print(col);
                }
                for (int col = 1; col <= n; col++) {
                    System.out.print(l - row + 1);
                    l--;
                }
            } else {
                for (int col = 1; col <= n - row + 1; col++) {
                    System.out.print(col);
                }
                for (int col = 1; col <= 2 * m - 1; col++) {
                    System.out.print(" ");
                }
                m++;
                for (int col = 1; col <= n - row + 1; col++) {
                    System.out.print(l - row + 1);
                    l--;
                }
            }
            System.out.print("\n");
        }
    }
}
