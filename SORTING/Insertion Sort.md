## Implemention

````

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 5, 2};
        InsertionSort(arr);
    }

    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {  // Start from the second element
            int temp = arr[i];  // The element to be placed in its correct position
            int j = i - 1;
            
            // Shift elements that are greater than the key to the right
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;  // Place the key in its correct position
        }
        System.out.println(Arrays.toString(arr));  // Print the sorted array
    }
}
````
