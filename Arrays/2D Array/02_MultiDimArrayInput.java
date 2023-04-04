// Program to take user input in 2D array
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArrayInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][] data = new int[3][2];

        System.out.println("Enter the array elements.");

        for (int i = 0; i < data.length; ++i) {
            for (int j = 0; j < data[0].length; ++j) {
                data[i][j] = input.nextInt();
            }
        }

        input.close();

        System.out.println("Data: " + Arrays.deepToString(data));
    }
}
