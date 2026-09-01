package pattern;

public class Hollow_square {
    public static void main(String[] args) {
        int n = 8;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(row == 1 || row == n){
                    System.out.print("* ");
                }
                else{
                    if (col == 1 || col == n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  "); // we are giving double space
                    }
                }
            }
            System.out.println();
        }
    }
}
