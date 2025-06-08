public class p5 {
    public static void main(String[] args) {
        // 1
        // 22
        // 333
        // 4444

        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.print("\n");
        }

        // 4444
        // 333
        // 22
        // 1

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(n - row + 1);
            }
            System.out.print("\n");
        }

        // 1
        // 22
        // 333
        // 4444
        // 333
        // 22
        // 1

        for (int row = 1; row <= 2 * n - 1; row++) {
            int breakCondition = row <= n ? row : (2 * n - 1) - row + 1;
            for (int col = 1; col <= breakCondition; col++) {
                System.out.print(breakCondition);
            }
            System.out.print("\n");
        }

        // ...1
        // ..22
        // .333
        // 4444

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= n - row) {
                    System.out.print(" ");
                } else {
                    System.out.print(row);
                }
            }
            System.out.print("\n");
        }

        // 4444
        // .333
        // ..22
        // ...1

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(n - row + 1);
                }
            }
            System.out.print("\n");
        }
        // ...1
        // ..22
        // .333
        // 4444
        // .333
        // ..22
        // ...1

        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= n; col++) {
                if (row <= n) {
                    if (col <= n - row) {
                        System.out.print(" ");
                    } else {
                        System.out.print(row);
                    }
                } else {
                    if (col <= row - n) {
                        System.out.print(" ");
                    } else {
                        System.out.print(2 * n - row);
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
