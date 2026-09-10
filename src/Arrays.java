public class Arrays {

//    Array :- An array is a collection of elements of the same data type stored in continuous memory locations.
////    Array Declaration :
//    int[] arr;
//
////    Array allocation :
//    arr = new int[5];
//
////    Array Initialisation :
//    int[] arr1 = {1, 2, 3, 4,5};

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

//        for (int index = 0; index <= arr.length; index++) {
//            System.out.println(arr[index]);
//        }

//        forEach loop
//        for(int val : arr){
//            System.out.print(val);
//        }
//      ----------------------------------------------------------------------------------- //
//        taking input in an array :
//        int[] brr = new int[5];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < brr.length; i++) {
//            System.out.print("enter the value for array: ");
//            brr[i] = sc.nextInt();
//        }
//
//        for(int val : brr){
//            System.out.print(val);
//        }
//        --------------------------------------------------------------------   //
//        find the sum of all the elements in the array
//        int[] sumArray = {2, 5, 7, 8, 9, 10};
//
//        int sum = 0;
//
//        for( int val : sumArray) {
//            sum = sum + val;
//        }
//        System.out.println(sum);

//        ------------------------------------------------------------------------  //
//        find the product of all the elements in the array

//        int [] productArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int product = 1;
//        for(int val : productArray){
//            product = product * val;
//        }
//        System.out.println("the product of all the elements in the array:" + product);

//        --------------------------------------------------------------------------  //
//        find the maximum value in array :
//
//        int [] maxArray = {1, -2, 4, 5, 8, 3, 10,};
//        int maxValue = 0;
//        for(int val : maxArray){
//            if(val >= maxValue){
//                maxValue = val;
//
//            }
//        }
//        System.out.println("The maximum value in the array is : " + maxValue);

//        ---------------------------------------------------------------- //
//        find the minimum value in the array :-

//        int [] minArray = {1, 2, -3, 0, 4, -1};
//        int minimum = 0;
//        for(int val : minArray){
//            if(val <= minimum){
//                minimum = val;
//            }
//        }
//        System.out.println("The minimum value in the array is : " + minimum);

//        ------------------------------------------------------------------ //
//        Reverse the array :
        int [] Array = {1, 2, 3, 1, 3, 4, 5};

        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();

//        -------------------------------------------------------------------  //
//        Liner search :
        Scanner sc = new Scanner(System.in);
        System.out.print("Search num : ");

        int target = sc.nextInt();
        for(int val : Array){
            if(target == val){
                System.out.println(true);
                break;
            } else{
                System.out.println(false);
                break;
            }
        }
    }

}
