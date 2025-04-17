import java.util.Arrays;

public class O6MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][]; 
        // System.out.println(arr.length); //3 
        int[][] arrX = new int[3][10]; 
        // System.out.println(arrX.length); // 3
        int[][] arr2 = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        int[][] arrY = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        for(int[] a: arrY){
            System.out.println(Arrays.toString(a));
        }
        /*[1, 2, 3]
            [4, 5]
            [6, 7, 8, 9] */

        //same thing manually : 
        for(int row = 0; row < arrY.length; row++){
            for(int col = 0; col < arrY[row].length; col++)
                System.out.print(arrY[row][col] + " ");
            System.out.println();
        }
        //1 2 3 
        // 4 5 
        // 6 7 8 9
    }
}
