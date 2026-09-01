package pattern;

public class Numeric_pyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n -row ; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            for (int col = 1; col <= row-1; col++) {
                System.out.print((row - col) + " ");
            }
            System.out.println();
        }
    }
}
