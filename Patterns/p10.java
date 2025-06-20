public class p10 {
    public static void main(String[] args) {
        // 123456789
        // 1234.6789
        // 123...789
        // 12.....89
        // 1.......9
        int n = 5;
        int l = n;
        int m = 1;
        int st = n + 1;
        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                for (int col = 1; col <= 2 * n - 1; col++) {
                    System.out.print(col);
                }
            } else {
                int until = l - 1;
                for (int col = 1; col <= until; col++) {
                    System.out.print(col);
                }
                l--;
                int till = 2 * m - 1;
                for (int col = 1; col <= till; col++) {
                    System.out.print(" ");
                }
                m++;
                for (int col = st; col <= 2 * n - 1; col++) {
                    System.out.print(col);
                }
                st++;
            }
            System.out.print("\n");
        }
    }
}
