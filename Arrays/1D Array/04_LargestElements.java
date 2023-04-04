// Find the largest element from an array
public class LargestElements {
    
    // Defined this method to find largest element
    public static int largestElement(int[] arr) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; ++i) {
            if (largest < i) {
                largest = i;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        
        int[] data = new int[] {95, 18, 78, -98};
        int result = largestElement(data);
        System.out.println(result);
    }
}
