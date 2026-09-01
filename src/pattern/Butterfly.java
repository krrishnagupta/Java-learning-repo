package pattern;

public class Butterfly {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("x ");
            }
            for (int col = 1; col <= 2*(n - row); col++) {
                System.out.print("  ");
            }
            for (int st = 1; st <= row; st++) {
                System.out.print("x ");
            }
            System.out.println();
        }

//        part 2
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=(n + 1 - row) ; col++) {
                System.out.print("x ");
            }
            for(int sp = 1; sp <= 2*(row -1); sp++){
                System.out.print("  ");
            }
            for (int st = 1; st <= n + 1 - row; st++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
