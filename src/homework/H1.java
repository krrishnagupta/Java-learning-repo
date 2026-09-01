public class H1{
    public static void main(String[] args) {

        // print the even number from 1 to 100 :-
        // for(int i = 1; i <= 100; i++){
        //     if(i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }

        // System.out.print("enter the value of n:");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.close();

        // int sum = 0;

        // for (int i = 0; i <= n; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        for (int i = 50; i <= 100; i++) {
            if(i % 7 == 0){
                System.out.println("the number from 50 to 100 wich is completely divided by 7" + i);
            }
        }
    }
}
