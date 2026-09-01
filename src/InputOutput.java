import java.util.Scanner;

public class InputOutput {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value for b: ");
        float b = sc.nextFloat();

        System.out.println("the sum of a and b is : " + (a + b));

        System.out.print("inter the boolean : ");
        boolean c = sc.nextBoolean();
        System.out.println("the boolean value is : " + c);

        System.out.print("Enter your name: ");
//        String name = sc.next(); // it will stop when it encounters the space that's why it only prints - "krishna", not the whole line - "krishn kumar gupta"
        String fullname = sc.nextLine(); // it will print the whole line
        System.out.println("your name is : " + fullname);


        sc.close();
    }
}
