package pattern;

public class Alphabetic_pyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int spCol = 1; spCol <= n - row; spCol++) {
                System.out.print("  ");
            }
            for (int col1 = 1; col1 <= row; col1++) {
                System.out.print((char)(col1 + 64 )+ " ");
            }
            for (int col2 = 1; col2 <= row - 1; col2++) {
                System.out.print((char)(64 + row - col2) + " ");
            }
            System.out.println();
        }
    }
}
