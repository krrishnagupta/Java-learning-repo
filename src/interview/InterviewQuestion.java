package interview;

/**
 * print right angle triangle
 * skip prime number
 * the integer of Even row arranged - in Descending order
 * the integer of Odd row arranged  - in Ascending order
 * */

public class InterviewQuestion {

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        else{
            for(int i = 2; i*i <= num; i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

     static void Pattern(int num){
         int count = 1;
         for(int row = 1; row <= num; row++){

             int [] arr = new int[row];  // initialize array

             for(int col = 0; col < row; col++){
                 while(isPrime(count)){
                     count ++;
                 }
                 arr[col] = count;
                 count++;
             }
             if(row % 2 != 0){
                 for(int val : arr){
                     System.out.print(val + " ");
                 }
             }else{
                 for(int col = arr.length - 1; col >= 0; col--){
                     System.out.print(arr[col] + " ");
                 }
             }
             System.out.println();
         }
     }

    public static void main(String[] args) {

        Pattern(4);


    }
}
