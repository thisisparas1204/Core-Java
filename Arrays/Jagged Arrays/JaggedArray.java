// Jagged Arrays.
import java.util.Arrays;

public class JaggedArray {
    
    public static void main(String[] args) {
        
        // 1st way to create Jagged array.
        int[][] data1 = new int[][] {{5, 10, 15},
                                {20, 25},
                                {30, 35, 40, 45}
        };

        System.out.println("The elements of data1 are: " + Arrays.deepToString(data1));

        // 2nd way to create Jagged array.
        int[][] data2 = new int[][]{new int[]{5, 10, 15},
                                new int[]{20, 25},
                                new int[]{30, 35, 40, 45}
        };

        System.out.println("The elements of data2 are: " + Arrays.deepToString(data2));

        // 3rd way to create Jagged array.
        int[][] data3 = {{5, 10, 15},
                        {20, 25},
                        {30, 35, 40, 45}
        };

        System.out.println("The elements of data2 are: " + Arrays.deepToString(data3));

        // If you need to access elements of 2nd array from data3...
        System.out.println("Elements of 2nd array from data2: " + Arrays.toString(data2[1]));
    }
}
