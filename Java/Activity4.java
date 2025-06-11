package Activities;

public class Activity4 {
	public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        
        // Call the insertion sort method
        insertionSort(arr);
        
        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        // Loop through all the elements of the array
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // The element to be placed at its correct position
            int j = i - 1;
            
            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }
}
