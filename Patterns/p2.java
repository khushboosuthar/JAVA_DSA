public class p2 {
    public static void main(String[] args) {
        // 1
        // 12
        // 123
        // 1234
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.print("\n");
        }
        // a
        // ab
        // abc
        // abcd
        for (int row = 1; row <= n; row++) {
            for (char col = 'a'; col <= 'a' + row; col++) {
                System.out.print(col);
            }
            System.out.print("\n");
        }
        // edcba
        // dcba
        // cba
        // ba
        // a
        char startChar = (char) ('a' + n - 1); // e
        for (int row = 1; row <= n; row++) {
            for (char col = (char) (startChar - row + 1); col >= 'a'; col--) {
                System.out.print(col);
            }
            System.out.print("\n");
        }
    }
}
