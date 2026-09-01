public class operator {
    public static void main() {
//       ## Arithmetic operator :-
        int num = 5;
        int numm = 4;

        System.out.println(num + numm);  // addition
        System.out.println(num - numm);  // subtraction
        System.out.println(num * numm);  // multiplication
        System.out.println(num / numm);  // division
        System.out.println(num % numm);  // reminder

//      ##  Comparison operator / Relational Operators :-
        int c = 5;
        int n = 1;
        char m = 1;
        char o = '1';

        System.out.println(c == n); // equal to
        System.out.println(c != n); // not equal to
        System.out.println(c > n); // greater than
        System.out.println(c < n); // less than
        System.out.println(c <= n); // greater than equal to
        System.out.println(c >= n); // less than equal to


        System.out.println(m == n);  // It will print "true", because the char is going to be implicitly type-cased into int and then the value of the n and m is going to be the same which returns the true.

        System.out.println(n == o);  // it will return false because the value of char o hold the ASCII number which value is 49 so it will compare the number 49 and 1 which is false



//      ##  Logical Operators
        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore); // AND operator both condition should true
        System.out.println(completedDSA || completedCore); // OR operator, at least one condition should be true
        System.out.println(!completedCore); // NOT operator, it reverses the boolean value

//      ##  Unary Operators
        int activeUsers = 100;

        int prefix = ++activeUsers; // increament operator
        int postfix = activeUsers++; // decrement operator

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);

//      ## Bitwise Operators
        int x = 6;  // 00000110
        int y = 3;  // 00000011

        System.out.println(x & y);  // bitwise AND
        System.out.println(x | y); // bitwise OR
        System.out.println(x ^ y); // bitwise XOR
        System.out.println(~x); // bitwise complement
        System.out.println(x << 1); // left sift
        System.out.println(x >> 1); // right sift

//     ## instanceof Operator
        String track = "CodeHelp ONE";

        boolean result = track instanceof String;

        System.out.println(result);

//     ## Ternary Operator: shorthand of if/else
        int solvedProblems = 320;

        String level = (solvedProblems >= 300) ? "Advanced" : "Intermediate";

        System.out.println(level);
    }
}
