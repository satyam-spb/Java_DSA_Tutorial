package Coding.Java.JavaBasics;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    int a = 0, b = 1;
    System.out.print("Enter n for fibonacci sequence  : ");
    int n = in.nextInt();
    for (int i = 2; i <= n; i++) {
        int temp = b;
        b = a + b;
        a = temp;
    }
    System.out.println("Rq no. is : " + b);
    }
}
