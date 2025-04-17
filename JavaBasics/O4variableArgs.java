import java.util.Arrays;

public class O4variableArgs {
    public static void main(String[] args) {
        //we can give any no. of args in greet() but should be of same datatype as declared in fnc 
        greet(1,2,3,4,5,6);
        greet(1,2,3);
        greet(null);

        //meet() can have 2(min) or more args
        meet(1,2,3,4,5,7);

        //variable args should always be at the end of args 
        //eg : meet(int a , int ...v , int b) -> is wrong

        //overloading with variable args
        overLoad(1,2,3,4); // Correct
        overLoad("hi", "hello"); //Correct
        // overLoad(); //Error : The method overLoad(String[]) is ambiguous for the type variableArgs ie java can't decide which one to call
    }

    static void greet(int ...v){
        // System.out.println(v); //in java, we cannot directly print arrays cuz it doesn't print the values instead  it prints something like [I@ followed by a hashcode, which is the default toString() representation for arrays.

        //So we can print it by iterating through ele or by converting it to string

        System.out.println(Arrays.toString(v));
    }

    static void meet(int a, int b, int ...v){
        System.out.println(a + " " + b);
    }

    static void overLoad(String ...s){
        System.out.println(Arrays.toString(s));
    } 

    static void overLoad(int ...s){
        System.out.println(Arrays.toString(s));
    } 
}
