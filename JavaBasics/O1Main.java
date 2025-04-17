
import java.util.Scanner;

/**
 * Main
 */
public class O1Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //To store large ints in readable format
        // int satyamNetWorth = 10_000_000;
        // System.out.println(satyamNetWorth); //10000000

        //We can take inputs for both Integer values in same line
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();
        // System.out.println(n1 + n2); 
        // 55 50
        // 105

        //********TYPE CONVERSION */
        // byte a = 100;
        // byte b = 122;
        // byte c = 10 ; 

        // byte ans = a + b; 
        //This is error(Type Mismatch) cuz Java implicitly converts any arithmetic operations performed in byte, short, char to int

        // byte ans = (byte) (a * b / c);
        //Both a and b are bytes so 100 * 20 > 127, the operation is stored in int and the result is returned as int

        int x = 130;
        b = (byte)x; // x > 127 so how will b store x ? 
        // System.out.println("B is = " + b); // - 126
        // since 130 > 127 so , 127 - 256 = -126
        // if we've larger value eg 2000, then it'll subtract 256 again and again until it falls within the range of byte

        // System.out.println(Math.max(a,Math.max(b,c)));

        // char ch = in.next().trim().charAt(0);

        //Reverse
        /* 
        System.out.print("Enter a no. to reverse : ");
        int n = in.nextInt();
        int revN = 0;
        while(n > 0){
            int rem = n % 10;
            revN = revN * 10 + rem;
            n /= 10;
        }
        System.out.println("Reversed no. is : " + revN);
        */

        // == vs .equals() for String
        // name1.equals(name2) : checks character by character if they're equal ie checks if both've same sequence of characters
        // == checks the reference of name1 and name2 ie if both point to same object then it returns true else false ie they can have exact same value but in diff objects so false. Basically checks if they're in same memory location

        
        in.close();
    }
}