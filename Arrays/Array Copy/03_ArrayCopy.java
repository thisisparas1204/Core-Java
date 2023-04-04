// Copying Arrays Using System.arraycopy() 
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        
        int[] data = new int[] {10, 20, 30};

        System.out.println("Data: " + Arrays.toString(data));

        // Creating arr array of having length of 2 elements
        int[] data2 = new int[2];

        // copying elements from data array to data2 arrary
        System.arraycopy(data, 0, data2, 0, data2.length);
        System.out.println("Data: " + Arrays.toString(data));
    }
}
