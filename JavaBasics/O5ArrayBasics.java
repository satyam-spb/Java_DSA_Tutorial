import java.util.Arrays;

public class O5ArrayBasics {
    public static void main(String[] args) {

        // 'new' is used to create an object

        int[] a; //declaration of array (in stack) (at compile time) ( declaring 'int[] a' creates a reference variable on the stack that can point to an array object.)

        // System.out.println(Arrays.toString(a)); //Error : The local variable a may not have been initialized

        a = new int[5]; //initialization : object creation (heap) (at run time - dynamic memory allocation)

        //after initialization all int array values are 0 by default and String - null (Default value of any reference varialble is null)

        // int x = null; //Type mismatch: cannot convert from null to int
        
        /* The 'new' keyword is used here, which typically means memory allocation on the heap. The array object itself is created in the heap, and the reference variable 'a' now points to this heap memory location.
         * 
         */


        //Storing Primitive vs Reference data types in java: 
        /* They hold raw values. When you declare a primitive variable, like int x = 5, the value 5 is stored directly in the stack memory. The stack is fast and manages method execution and local variables. Since primitives are stored here, accessing them is quick.

        On the other hand, reference types are objects, arrays, or anything created with the 'new' keyword. For example, int[] arr = new int[5]. Here, arr is a reference variable. The actual array object is stored in the heap memory, which is a larger area for dynamic memory allocation. The reference variable arr in the stack holds the memory address pointing to the heap location where the array resides.
        
        Wait, but why is there a distinction? Oh right, primitives have a fixed size, which makes them easy to store on the stack. Objects can vary in size and need more flexible memory management, hence the heap. Also, stack memory is automatically managed with method calls (LIFO), while heap requires garbage collection when objects are no longer referenced.*/
    
        // VIP 
        /* - Array Objects are in heap
            - Heap memory is not continuous
            - so internally array may or may not be continuous in java, totally depends on JVM
        */ 

    }
}
