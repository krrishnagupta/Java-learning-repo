import java.util.Scanner;

public class Array_2d {

    public static void TraverseArray(){
        int[][] arr2 = {
                {1, 2, 3, 4},
                {1, 3, 4, 5, 6},
                {1, 2, 5, 6, 7, 8}
                };

//        print the value of 2D array
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void InputArray(){
        int[][] arr = new int[3][4];

        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("print the value for array row:" + row + " col:" + col);
                arr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void Sum(){
        int [][] arr = {{1, 2, 3, 4}, {1, 2, 3, 4, 5}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                sum = sum + value;
            }
        }
        System.out.println(sum);
    }

    public static void Multiplication(){
        int[][] arr = {{1, 2, 3, 4, 5}, {1, 2, 3, 4}};
        int multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                multiply = multiply * value;
            }
        }
        System.out.println(multiply);
    }

    public static void MaxValue(){
        int[][] arr = {{1, 2, 3, 4, 15}, {1, 2, 32, 4}};
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum value is :" + max);
    }

    static public void MinValue(){
        int[][] arr = {{1, -1, 0, 2, 3}, {2, 5, 6, 3, -7}};
        int minVal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < minVal){
                    minVal = arr[i][j];
                }
            }
        }
        System.out.println("Minimum value of array is : " + minVal );

    }

    public static void main(String[] args) {

    MaxValue();
//    MinValue();
    }
}
