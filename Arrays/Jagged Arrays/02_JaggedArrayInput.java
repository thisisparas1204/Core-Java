
import java.util.Scanner;
import java.util.Arrays;

public class JaggedArrayInput {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[][] data = new int[3][];
        data[0] = new int[3];
        data[1] = new int[2];
        data[2] = new int[4];

        for (int i = 0; i < data.length; ++i) {
            System.out.println("Enter the elements for " + (i + 1) + " member array.");
            for (int j = 0; j < data[i].length; ++j) {
                data[i][j] = input.nextInt();
            }
        }
        
        input.close();

        System.out.println("The array elements are: " + Arrays.deepToString(data));
    }    
}
