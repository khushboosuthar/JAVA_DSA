public class p13 {
    public static void main(String[] args) {
        // *********
        // ****.****
        // ***...***
        // **.....**
        // *.......*
        // **.....**
        // ***...***
        // ****.****
        // *********
        int n = 4;
        int ps = -1;
        int st = n;
        int till = 2 * n - 1 - 4;
        for (int row = 1; row <= 2 * n - 1; row++) {
            if (row == 1 || row == 2 * n - 1) {
                for (int col = 1; col <= 2 * n - 1; col++) {
                    System.out.print("*");
                }
            } else {
                if (row <= n) {
                    ps = ps + 2;
                    for (int col = 1; col <= n - row + 1; col++) {
                        System.out.print("*");
                    }
                    for (int col = 1; col <= ps; col++) {
                        System.out.print(" ");
                    }
                    for (int col = st; col <= 2 * n - 2; col++) {
                        System.out.print("*");
                    }
                    st++;
                } else {
                    for (int col = 1; col <= row - n + 1; col++) {
                        System.out.print("*");
                    }
                    for (int col = 1; col <= till; col++) {
                        System.out.print(" ");
                    }
                    till = till - 2;

                    for (int col = 1; col <= row - n + 1; col++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
