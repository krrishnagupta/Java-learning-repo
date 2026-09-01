package pattern;

public class Numeric_pyramid_2 {

    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col_space = 1; col_space <= n - row; col_space++) {
                System.out.print("  ");
            }
            for (int col_num = 1; col_num <= (2*row - 1); col_num++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
