public class p7 {
    public static void main(String[] args) {
        int n = 3;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            int nst = n - row + 1;
            for (int col = 1; col <= nst; col++) {
                System.out.print(col);
            }
            int pn = n - row;
            for (int col = 1; col <= n - row; col++) {
                System.out.print(pn);
                pn--;
            }
            System.out.print("\n");
        }
    }
}
