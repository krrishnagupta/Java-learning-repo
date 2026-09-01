package pattern;

public class Dimond {
    public static void main(String[] args) {
        int n = 5;
        
//        part -1 
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= (n - row); col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= (2 * row - 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        part -2
        for (int row = 1; row <= n; row++) {
            if(row == 1){
                continue;
            }

            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=(2*n - 2*row + 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
