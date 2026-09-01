public class Method {
//    1st Question
    static void PrintWelcomeMessage(){
        System.out.println("Hello, I am Krishna and How are You ?");
    }

//    2nd Question
    static int Add(int a, int b){
        int sum = a + b;
        return sum;
    }

//    3rd Question
    static boolean IsEven(int a){
        return a % 2 == 0;
    }

//    4th Question
    static int GetMaximum(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }

//     5th Question
    static float Percentage(float obtain, float total){
        return (float) (obtain / total * 100);
    }

//    6th Question : Overloaded Method -
    static void Display(int a){
        System.out.println(a);
    }
    static void Display(String message){
        System.out.println(message);
    }

//    7th Question
    static int UpdateValue(int x){
        int updatedValue = x + 10;

        return updatedValue;
    }

    public static void main(String[] args) {
//        1st
        PrintWelcomeMessage();

//        2nd
        int sum = Add(5, 6);
        System.out.println(sum);

//        3rd
        boolean isEven = IsEven(4);
        System.out.println(isEven);

//        4th
        int maximumNum = GetMaximum(8, 6);
        System.out.println(maximumNum);

//        5th
        float percentage = Percentage(351, 500);
        System.out.println("percentage: " + percentage + " %");

//        6th
        Display(6);
        Display("Hello, bye");

//        7th
        int original = 5;
        int updatedVariable = UpdateValue(original);
        System.out.println("updated value is : "+ updatedVariable);
        System.out.println("original value is:" + original);

    }
}
