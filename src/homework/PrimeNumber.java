package homework;

public class PrimeNumber {

    public static boolean prime(int n){
        if(n < 2){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n%2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++){
//            if(prime(i)){
//                System.out.println(i);
//            }
//        }

        for (int i = 50; i <= 100; i++) {
            if(i % 7 == 0){
                System.out.println("the number from 50 to 100 which is completely divided by 7 : " + i);
            }
        }
    }
}
