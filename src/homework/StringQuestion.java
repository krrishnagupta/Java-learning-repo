package homework;

import java.util.Scanner;

public class StringQuestion {

    // Q. print each character of string-
    public static void PrintStringChar(String str){
        char[] ch = str.toCharArray();
        for(char i : ch){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // Q. count vowels in string
    public static void CountVowels(String str){
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count = 0;

        for(char ch : arr){
            for(int i = 0; i < str.length(); i++){
                if(ch == str.charAt(i)){
                    count ++;
                }
            }

        }
        System.out.println("no. of vowels : " + count);
    }

    // Q. count length of the string without length() method
    public static void StringLength(String str){
        char[] arr = str.toCharArray();
        System.out.println(arr.length);
    }

    //Q. Reverse the string
    public static void ReverseString(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            char ch =str.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }

    //Q. print the palindrome
    public static void palindromeString(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            char ch =str.charAt(i);
            reverse = reverse + ch;
        }
        if(reverse.equals(str)){

        System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    //Q. count the number of consonants in the string
    public static void CheckConsonants(String str){
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))&& (!vowels.contains(String.valueOf(ch)))){
                count++;
            }
        }
        System.out.println("the no. of consonents: " + count);
    }

    //Q. Remove all the spaces from the String
    public static void RemoveSpaceFromString(String str){
        str = str.replace(" ", "");
        System.out.println(str);
    }

    //Q. count characters in string
    public static void CountCharacter(String str){
        int num = 0;
        for(int i = 0; i <= str.length(); i++){
        num = i;
        }
            System.out.println("the number of words : " + num);
    }

    //Q. Count the words in the Sentence
    public static void CountWords(String str){
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("the no of words: " + count);
    }

    //Q. check if string contains only digit
    public static void DigitInString(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                count++;
            }
        }
        if(str.length() == count){
            System.out.println("yes the string is full of digits");
        }else{
            System.out.println("no, string also contains letters");
        }
    }

    //Q. find the frequency of character in the string
    public static void CheckFrequency(String str){

        String duplicate = "";

        // loop to the string and take the current letter
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;

            // // Loop through the string and count how many times the current character occurs
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }

            // checking letter is in the duplicate string or not if it is we continue and if not we add the char in to duplicate string
            if(duplicate.indexOf(ch) != -1){
                continue;
            }
            duplicate = duplicate + ch;

            // print the value with occurrence
            System.out.println(ch + " = " + count);
        }
    }

    //Q. convert string into uppercase without method
    public static void ConvertStringUpperCase_withoutMethod(String str){

        String upper = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // by using Character.toUpperCase(ch) method
            ch = Character.toUpperCase(ch);

//            // ASCII approach
//            if(ch >= 'a' && ch <= 'z'){
//                ch = (char)(ch -32);
//            }

             upper = upper + ch;
        }
        System.out.println(upper);
    }

    // ------------------------------------------------------------------------------------------------------------------//

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("print string : " );
        String str = sc.nextLine();

//        PrintStringChar(str);
//        StringLength(str);
//        CountVowels(str);
//        ReverseString(str);
//        palindromeString(str);
//        CheckConsonants(str);
//        RemoveSpaceFromString(str);
//        CountCharacter(str);
//        CountWords(str);
//        DigitInString(str);
//        CheckFrequency(str);
//        ConvertStringUpperCase_withoutMethod(str);


    }

}
