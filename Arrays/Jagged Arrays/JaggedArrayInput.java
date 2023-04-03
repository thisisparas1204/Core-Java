
import java.util.Scanner;
import java.util.Arrays;

public class JaggedArrayInput {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[][] data = new int[3][];
        data[0] = new int[3];
        data[1] = new int[2];
        data[2] = new int[4];

        System.out.println("Enter the elements for 1st member array..");

        for (int member_array = 0; member_array < 1; ++member_array) {
            for (int j = 0; j < data[0].length; ++j) {
                data[member_array][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements for 2nd member array..");

        for (int member_array = 1; member_array < 2; ++member_array) {
            for (int j = 0; j < data[1].length; ++j) {
                data[member_array][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements for 3rd member array..");

        for (int member_array = 2; member_array < 3; ++member_array) {
            for (int j = 0; j < data[2].length; ++j) {
                data[member_array][j] = input.nextInt();
            }
        }

        input.close();

        System.out.println("The array elements are: " + Arrays.deepToString(data));
    }    
}
