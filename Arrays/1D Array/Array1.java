// Create an array and access the elements of an array
public class Array1 {
    public static void main(String[] args) {
        
        // Declare & allocate an array
        int[] arr = new int[3];

        // Initializing the array
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;

        System.out.println("The elements of arr are: ");

        for (int item : arr) 
            System.out.print(item + " ");

        System.out.println("\nThe elements of arr2 are: ");

        int[] arr2 = new int[] {10, 20, 30, 40};

        // Updating the 2nd element of the array
        arr2[1] = 99;

        for (int item : arr2)
            System.out.print(item + " ");
    }
}
