package homework;

public class ReverseArray {

    public static void main(String[] args) {
        // Reverse Array : by brute force

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Reverse the Array by the Two pointer Approach

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for(int val : arr){
            System.out.print(val + " ");
        }

    }
}
