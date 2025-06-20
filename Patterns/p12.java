public class p12 {
    public static int Min(int a, int b) {
        // 1111111
        // 1222221
        // 1233321
        // 1234321
        // 1233321
        // 1222221
        // 1111111
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                int x = row, y = col;
                if (row > n) x = 2*n -row;
                if(col>n) y = 2*n -col;
                System.out.print(Min(x, y));
            }
            System.out.println();
        }
    }
}
