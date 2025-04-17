import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class O7ArrayList {
    /*
    - We use ArrayList when we aren't sure about the array size 
    - We can add as many elements as we want in an ArrayList but should be of same datatype
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>(2);
        // default value is []
        // System.out.println(intList); //[]
        // System.out.println(intList.get(0)); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0

        intList.add(25);
        intList.add(45);
        intList.add(65);
        intList.add(225);
        //We see initial capacity is 2 but we added 4 elements, so don't need to worry about it

        System.out.println(intList); //[25, 45, 65, 225]
        //we don't need to use toString() here cuz println (or print) internally change it to String before displaying it to output screen

        
        System.out.println(intList.contains(65));

        // intList.set(index, element to replace) 
        intList.set(2, null);

        // intList.remove(index);
        intList.remove(1);
        System.out.println(intList);

        // intList[0] syntax is wrong and doesn't work. instead use intList.get(index)
        System.out.println(intList.get(2));


        //How does ArrayList work internally? - same as arrays
        /*  How can we add a lot of elements without worrying about size? Is there no size limit?
        - Spoiler : It has fixed size. 
        - when the ArrayList is filled to certain amount(eg half), it creates a new ArrayList of bigger size(size is calculated by checking memory left, preferredLength etc)
        - copies the value from old array to new
        - Deletes the old array
        */
    
        //Multidimensional ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // list.add([1,2,3]); //this doesn't work cuz [1,2,3] isn't an ArrayList, Java requires ArrayList to be instantiated with 'new' and Also, autoboxing might be an issue. The elements 1,2,3 are int primitives, but ArrayLists hold objects, so they need to be Integer objects.

        //instantiation
        for(int i = 0; i < 2; i++){
            list.add(new ArrayList<>());
        }

        //adding ele
        // for(int i = 0; i < 2; i++){
        //     for(int j = 0; j < 5; j++){
        //         System.out.println("Enter a value : ");
        //         list.get(i).add(in.nextInt());
        //     }
        // }

        System.out.println(list);

        //reverse an Array
        reverseArray(new int[]{1,2,3,4,5});
    }

    static void reverseArray(int[] arr){
        if(arr.length == 0)
            return;
        System.out.println(Arrays.toString(arr));
        int start = 0, end = arr.length - 1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
