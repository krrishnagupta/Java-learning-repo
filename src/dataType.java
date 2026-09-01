//What Are Data Types?
//A data type specifies the type of data that a variable can hold. there are two types of Data Types -
// Premitive DataType and Non-premitive Datatype

//Primitive Data Types in Java
//Java has 8 predefined primitive data types. These are the most basic data storage types.:-

//1) boolean
//2) byte
//3) short
//4) int
//5) long
//6) double
//7) float
//8) char

//Non primitve Data types in java :
//1. String
//2. Arrays
//3. Classes
//4. Objects

public class dataType {

    public static void main(){

        //Example:

        boolean hasActiveSubscription = true;
        System.out.println(hasActiveSubscription);

        byte moduleLevel = 5;
        System.out.println(moduleLevel);
        //Default value: 0

        short contestScore = 1500;
        System.out.println(contestScore);
        //Default value: 0

        int totalUsers = 250000;
        System.out.println(totalUsers);
        //Default value: 0

        long platformVisits = 15000000000L;
        System.out.println(platformVisits);
        //Notice the L at the end. Without L, Java treats it as int.
        //Default value: 0

        double averageCompletionTime = 3.75;
        System.out.println(averageCompletionTime);
        //Default value: 0.0
        //⚠ Never use double for precise currency calculations due to rounding issues.

        float discountRate = 12.5F;
        System.out.println(discountRate);
        // Notice the F. Without F, Java treats decimal values as double.
        // Default value: 0.0f

        char gradeLevel = 'A';
        System.out.println(gradeLevel);
        //You can also assign using Unicode:
        char symbol = '\u2605';
        System.out.println(symbol);
        //Default value: '\u0000'

        char character = 'a';
        System.out.println(character);

    }
}
