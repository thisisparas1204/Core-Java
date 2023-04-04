// Copying Arrays Using copyOf()
import java.util.Arrays;

public class ArrayCopy4 {
    public static void main(String[] args) {
        
        int[] data1 = new int[] {10, 20, 30};
        System.out.println("Data1: " + Arrays.toString(data1));

        int[] data2 = Arrays.copyOf(data1, 3);
        System.out.println("Data2: " + Arrays.toString(data2));
    }
}