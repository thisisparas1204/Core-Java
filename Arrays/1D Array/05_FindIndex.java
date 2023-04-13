// Program to find the index of an elements
public class FindIndex {

    public static void findIndex(int[] arr, int n) {

        boolean isFound = false;
        
        if (arr == null) {
            System.out.println("This array is empty.");
            return;
        }
        
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == n) {
                isFound = true;
                System.out.println(n + " found at index " + i);
            }
        }

        if (!(isFound)) {
            System.out.println(n + " isn't found.");
        }
    }

    public static void main(String[] args) {
        
        int[] data = new int[] {98, 12, 34, 12};
        findIndex(data, 12);
        findIndex(data, 78);
    }
}
