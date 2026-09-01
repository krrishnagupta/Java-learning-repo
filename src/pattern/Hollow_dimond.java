package pattern;

public class Hollow_dimond {
    public static void main(String[] args) {
        int n = 5;
//        1st part
        for (int row = 1; row <= n; row++) {

            for(int col = 1; col <= (n-row); col++){
                System.out.print("  ");
            }
            if(row == 1){
                System.out.print("* ");
            }else{
                System.out.print("* ");

                for (int sp = 1; sp <= (2*row -3); sp++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

//        2nd part
        for (int row = 1; row <= n; row++) {

            if(row == 1){
                continue;
            }
            for (int col = 1; col <= (row -1); col++) {
                System.out.print("  ");
            }

            if( row == n){
                System.out.print("* ");
            }else{
                System.out.print("* ");

                for (int col = 1; col <= (2*n - 2*row - 1); col++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
