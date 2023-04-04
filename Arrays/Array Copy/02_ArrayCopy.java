// Copying Arrays Using clone()
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        
        int[] data = new int[] {10, 20, 30};

        System.out.println("Data: " + Arrays.toString(data));

        int[] arr = data.clone();

        System.out.println("Arr: " + Arrays.toString(arr));
    }    
}
