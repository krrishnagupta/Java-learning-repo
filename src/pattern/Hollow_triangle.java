package pattern;

public class Hollow_triangle {
    public static void main(String[] args) {
        int n = 8;

        for (int row = 1; row <= n; row++) {
            if(row == 1 || row == 2 || row == n){
                for (int i = 1; i <= row ; i++) {
                    System.out.print("* ");
                }
            }else{
               //1*
                System.out.print("* ");

                //spaces
                for (int space = 1; space <= (row - 2) ; space++) {
                    System.out.print("  ");
                }
               //last*
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
