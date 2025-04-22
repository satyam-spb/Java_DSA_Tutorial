package Java_DSA_Tutorial.Searching;
import java.util.Scanner;


public class O2BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = {2,4,5,6,7,8};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int target = in.nextInt();
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + ((end-start) / 2) ; 
            if(arr[mid] == target){
                System.out.println("Element found at index : " + mid);
                break;
            }
            else if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;

        }
        if(start == end + 1) //NOTE : in Binary Search, if the target is not in the array(ie when loop breaks), the start == end + 1 always
            System.out.println("Element not present in the Array");
    }
}
