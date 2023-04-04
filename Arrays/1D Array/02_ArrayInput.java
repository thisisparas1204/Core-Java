// Taking user input in an array.
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Declaring & allocating the memory for an array.
        int[] data = new int[3];

        System.out.println("Enter the elements of an array:");

        for (int i = 0; i < data.length; ++i) {
            data[i] = input.nextInt();
        }

        input.close();

        System.out.println("The array elements are: ");

        for (int item : data) {
            System.out.print(item + " ");
        }
    }
}
