package pattern;

public class Solid_rombus {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row < n; row++) {
//            columns
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= n; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
