public class p3 {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        int n = 5;
        for (int row = 1; row <= 2 * n - 1; row++) {
            int breakCondition = row <= n ? row : 2 * n - row;
            for (int col = 1; col <= breakCondition; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // *****
        // ****
        // ***
        // **
        // *
        // **
        // ***
        // ****
        // *****

        for (int row = 1; row <= 2 * n - 1; row++) {
            int startCondition = row < n ? row : 1;
            int breakCondition = row < n ? n : row - n + 1;
            for (int col = startCondition; col <= breakCondition; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
