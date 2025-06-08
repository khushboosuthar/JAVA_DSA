public class p6 {
    public static void main(String[] args) {
        // ..*..
        // .***.
        // *****

        int n = 3;
        int nst1 = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= nst1; col++) {
                System.out.print("*");
            }
            nst1 = nst1 + 2;
            System.out.print("\n");
        }

        // *****
        // .***.
        // ..*..

        int nst2 = n + 2;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= nst2; col++) {
                System.out.print("*");
            }
            nst2 = nst2 - 2;
            System.out.print("\n");
        }
        // ..1..
        // .222.
        // 33333

        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= nst; col++) {
                System.out.print(row);
            }
            nst = nst + 2;
            System.out.print("\n");
        }

        // 33333
        // .222.
        // ..1..
        int nstn = n + 2;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= nstn; col++) {
                System.out.print(n - row + 1);
            }
            nstn = nstn - 2;
            System.out.print("\n");
        }

        // ..1..
        // .121.
        // 12321
        int nstnn = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            int pn = row - 1;
            for (int col = row + 1; col <= nstnn; col++) {
                System.out.print(pn);
                pn--;
            }
            nstnn = nstnn + 2;
            System.out.print("\n");
        }

        // 12321
        // .121.
        // ..1..

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            int nstt = n - row + 1;
            for (int col = 1; col <= nstt; col++) {
                System.out.print(col);
            }
            int pn = n - row;
            for (int col = 1; col <= n - row; col++) {
                System.out.print(pn);
                pn--;
            }
            System.out.print("\n");
        }

        // ..1..
        // .222.
        // 33333
        // .222.
        // ..1..

        // Diamond Shape
        // ..*..
        // .***.
        // *****
        // .***.
        // ..*..
    }
}