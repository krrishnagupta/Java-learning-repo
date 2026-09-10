import java.util.Scanner;

/**
 *  -> ' %10 ' is used to take the last digit in the number
 *  -> ' /10 ' is used to remove the last digit in the number
 *  -> Reverse Number Formula => reverse = reverse * 10 + last;
 *  -> IsPrime ? => loop through - i*i <= num, and check if num % i == 0 or not
 *  -> GCD Formula = Euclidean Algorithm :- (a, b) = (b, a%b)
 *  -> LCM Formula = LCM = (a * b)/GCD.
 *  -> Perfect Number = the sum of all divisor of that number is equal to the number like - 6 = 1*2*3 = 1+2+3 = 6, 6 == 6.
 *  -> Armstrong Number is - abc = a³ + b³ + c³ isEqualto abc, if digit count is increase power will also increase of all digit like 1634 = 1⁴ + 6⁴ + 3⁴ + 4⁴.
 *      example - '153'  =    1³ + 5³ + 3³   =>  1 + 125 + 27    => 153
 *
 *
*/

public class BasicMathForDSA {

    //Print Digit -
    public static void PrintDigit(int num){
        while (num != 0){
            int lastDigit = num % 10;
            System.out.println(lastDigit);
            // remove the last digit
            num = num/10;
        }
    }

    // Count Digit
    public static void CountDigit(int num){
        int count = 0;
        while(num != 0){
            int last = num % 10;
            count++;
            num = num/10;
        }
        System.out.println("The number of Digit in the integer is: " + count);
    }

    // Find the Sum of All Digit
    public static void SumOfAllDigit(int num){
        int sum = 0;
        while(num != 0){
            int last = num % 10;
            sum = sum + last;
            num = num/10;
        }
        System.out.println("The Sum of all digit is: " + sum);
    }

    // Reverse the number
    public static void ReverseNumber(int num){
        int reverse = 0;
        while(num != 0){
            int last = num % 10;
            reverse = reverse * 10 + last;
            num = num / 10;
        }
        System.out.println("The Reverse Order of the number: " + reverse);
    }

    // check if Palindrome or not
    public static void Palindrome(int num){

        int original = num;
        int reverse = 0;

        while(num != 0){
            int last = num % 10;
            reverse = reverse * 10 + last;
            num = num / 10;
        }
        if(original == reverse){
            System.out.println("yes, the number is palindrome.");
        }else{
            System.out.println("No, the number is not palindrome.");
        }
    }

    // check number is Even or Odd
    static void Even_or_Odd(int num){

            if(num % 2 == 0){
                System.out.println("Yes, the number is Even");
            }else{
                System.out.println("No, the number is odd");
            }
    }

    // check number is Prime number or not -
    static void ISprime(int num){
        boolean val = false;
        if(num == 1){
            System.out.println("it is not a prime number");
        }else {
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    val = true;
                }
            }
            if (val) {
                System.out.println("It is not prime number");
            } else {
                System.out.println("it is a prime number");
            }
        }
    }

    // GCD (Greatest Common divisor) / HCF (Highest Common Factor)
    static void GCD_by_EuclideanAlgo(int a, int b){
        // Euclidean Algorithm :- (a, b) = (b, a%b)
        while(b != 0){
            int old_b = b;
            b = a % b; // rem
            a = old_b;
        }
        System.out.println("The GCD of a and b by Euclidean Algorithm: " + a);
    }

    // LCM (Lowest Common Multiple) => [formula of LCM]  ---->   LCM = (a * b)/GCD
    static void LowestCommonMultiple(int a, int b){
        int prod = a * b;
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int lcm = prod / a;
        System.out.println("LCM of a and b : " + lcm);
    }

    static void Check_Armstrong(int num){
        int sum = 0;
        int original = num;

        // count digit
        int temp = num;
        int count = 0;
        while(temp != 0){
            temp = temp/10;
            count++;
        }

        // find Armstrong
        while(num != 0){
            int last = num%10;
            sum = sum + (int)Math.pow(last, count);
            num = num/10;
        }
        if(sum == original){
            System.out.println("Yes, " + original + " is a Armstrong Number");
        }else{
            System.out.println("No, " + original + " is NOT a Armstrong Number");
        }
    }

    static void Check_PerfectNumber(int num){
        int sum = 1;
        int original = num;
        for(int i = 2; i*i <= num; i++){
            if(num%i == 0){
                int firstFactor = i;
                int secondFactor = num/i;
                sum  = sum + firstFactor + secondFactor;
            }
        }
        if(original == sum){
            System.out.println("It is a Perfect number");
        }else{
            System.out.println("It is NOT a Perfect Number");
        }
    }

    static void PrintAllPrimeNumber_to_num(int n){
        for(int num = 2; num <= n; num++){

            boolean isNotPrime = false;

            for(int i = 2; i*i <= num; i++){
                if(num%i == 0){
                    isNotPrime = true;
                    break;
                }
            }
            if(isNotPrime == false){
                System.out.print(num + ", ");
            }
        }

    }


    // ---** Main Method **--- //
    public static void main(String [] args){
        // Taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        //----------------------   Calling Methods  -----------------------//
//        PrintDigit(num);
//        CountDigit(num);
//        SumOfAllDigit(num);
//        ReverseNumber(num);
//        Palindrome(num);
//        Even_or_Odd(num);
//        ISprime(num);
//        GCD_by_EuclideanAlgo(12, 18);
//        LowestCommonMultiple(12, 18);
//        Check_Armstrong(num);
//        Check_PerfectNumber(num);
        PrintAllPrimeNumber_to_num(num);
    }
}
