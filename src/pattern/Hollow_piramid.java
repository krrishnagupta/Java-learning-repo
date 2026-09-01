package pattern;

public class Hollow_piramid {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= (n - row) ; col++) {
                System.out.print("  ");
            }
            if(row == 1 || row == n){
                for (int star = 1; star <= (2*row - 1) ; star++) {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");

                for (int sp = 1; sp <= (2 * row - 3); sp++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
