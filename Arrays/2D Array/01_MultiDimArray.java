// 2D Arrays
import java.util.Arrays;

public class MultiDimArray {
    public static void main(String[] args) {
        
        int[][] data = new int[][] {{10, 20, 30},
                                    {11, 33, 44},
                                    {12, 34, 45}};

        System.out.println("Data: " + Arrays.deepToString(data));
    }
}
