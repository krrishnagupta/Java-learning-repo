package homework;



public class H2 {

    static void ProductOfEven(){
        int n = 1;
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                n = n * i;
            }
        }
        System.out.println("the product of the even number : " + n);
    }

    static void ProductOfOdd(){
        int n = 1;
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 1){
                n = n * i;
            }
        }
        System.out.println("the product of the even number: " + n);
    }

    public static void main(String[] args) {
        ProductOfEven();
        ProductOfOdd();
    }
}
