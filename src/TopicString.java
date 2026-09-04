import java.util.Locale;
import java.util.Scanner;

public class TopicString {

    /**
     * What is String :
     * String is the DataType which holds the sequence of Character, it is immutable means we can not change the String.

     * where String is Stored ?
     * The String value is stored in the - "String pull" of the Heap memory and the reference or the variable who hold the value is stored in the Stack memory.

     * Comparing Strings
     * == → checks whether both references point to the same String object.
     * .equals() → checks the characters/content of the String and is case-sensitive.
     * .equalsIgnoreCase() checks the characters/content like .equals(), but it is not case-sensitive.
     * */

//    -------------------------------------------------------------------------------------------------------------------------------//

    static void aboutString(){
        String firstName = "krishna Kumar";
        String lastName = "Gupta";

        System.out.println(firstName + " " + lastName);  // Concatenate String
        System.out.println(firstName.length());  // it gives the number of character that string it also includes spaces.
        System.out.println(firstName.charAt(4)); // it returns the character of that indexing
//        System.out.println(firstName[0]); // we can not access the character of string like that
    }

    static void IF_StringIs_immutable(){
        String str = "Krishna Kumar Gupta";
        str = "Kanha Gupta";

        System.out.println(str);

        /*
           Q. output: Kanha Gupta, why if it is immutable ?

           => Because java assigns new memory address to the string value in the String pull of the Heap memory.
           and the reference is change from old value to the new value.
        */
    }

    static void ComparingStrings(){
        String name = "krishna";
        String name1 = "krishna";
        // 1st way of comparing - //** It is not the right way to compare string that's why it is not used. **//
        if(name == name1){   // it does not compare the values.
        // it compares the address of the value if both variable refer to the same address it will return true if not it will return false.
            System.out.println("it is equal");
        }else{
            System.out.println("no, it is not equal");
        }
    }

    static void ComparingStringsWith_equalObject(){
        String name = "krishna";
        String name1 = new String("krishna");
        // 2st way of comparing - //** It is right way to compare strings **//
        if(name.equals(name1)){   // it is a case-sensitive and compare the values/characters of the string.
            System.out.println("it is equal");
        }else{
            System.out.println("no, it is not equal");
        }
    }

    static void ComparingStringsWith_equalsIgnoreCaseObject(){
        String name = "krishna";
        String name1 = "KRISHNA";
        // 3RD way of comparing - //** It is also right way to compare strings. but it is not case-sensitive **//
        if(name.equalsIgnoreCase(name1)){   // it is a not case-sensitive and compare the values/characters of the string.
            // It returns true if the characters are the same while ignoring uppercase and lowercase differences, and returns false if the characters are different.
            System.out.println("it is equal");
        }else{
            System.out.println("no, it is not equal");
        }
    }

    static void TakingString_Input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for String: ");
        String str = sc.next(); // It only takes first word of the line and ignore the rest of the line after the first space.
        System.out.println("the value of next() :" + str);

        System.out.println("Enter the value of string : " );
        String str2 = sc.next(); // it print whole line of the input string.
        System.out.println("the value of nextLine() :" + str2);
    }

    static void String_Methods(){
        String str = "KRISHNA";
        String str1 = "krishna";

        System.out.println(str.length());  // .length()
        System.out.println(str.charAt(1)); // .charAt()
        System.out.println(str.equals(str1)); // .equals()
        System.out.println(str.equalsIgnoreCase(str1)); // .equalsIgnoreCase()
        System.out.println(str.isBlank()); // .isBlank()
        System.out.println(str.isEmpty()); // .isEmpty()
        System.out.println(str.toLowerCase()); // .toLowerCase()
        System.out.println(str1.toUpperCase()); // .toUpperCase()


        String name = "    krishna kuamar gupta    ";
        System.out.println(name.length());
        name = name.trim();   // .trim() = removes spaces from the beginning and at end of the string
        System.out.println(name.length());

        String replace = name.replace("k", "x"); // .replace(old char, new char)
        System.out.println(replace);

        String str3 = "hi there i am learning java, can you help me to learn it.";
        System.out.println(str3.contains("learning")); // .contains("word") => check if the word is present in the string or not.
        System.out.println(str3.substring(3, 10)); // .substring(beginning-index, end-index) , beginning-index is inclusive and end-index is exclusive.
        System.out.println(str3.startsWith("hi"));  // .startsWith(string prefix)
        System.out.println(str3.endsWith("it"));    // .endsWith(string sufix)


        int num = 1234;
        System.out.println(num + 1);
        String str4 = String.valueOf(num);  // String.valueof(int value) => it changes integer value into string.
        System.out.println(str4 + 1);

        char[] chrr = str1.toCharArray(); // .toCharArray() => changes string into array of characters.
        for(char ch : chrr){
            System.out.println(ch);
        }

        String str5 = "my,name,is,krishna,kumar,gupta";
        String[] words = str5.split(","); // .split("word or expression from where you want to split the string")
        for(String st : words){
            System.out.println(st);
        }
    }

    public static void main(String[] args) {

        String str = "Krishna Kumar Gupta";
        str = "Kanha Gupta";

        /* Q. output: Kanha Gupta, why if it is immutable ?
           => Because java assigns new memory address to the string value in the String pull of the Heap memory.
           and the reference is change from old value to the new value. */

/*----------------------------------------------------------------------------------------------------------------------*/
//        Calling Methods here :-

        String_Methods();


    }
}
