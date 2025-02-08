## Implementation

````java[]

import java.util.Arrays;

public class Main {

    // Merge Sort function
    public static void mergeSort(int[] arr) {
        // Base case: If the array has more than one element
        if (arr.length > 1) {
            // Finding the middle point of the array
            int mid = arr.length / 2;

            // Dividing the array into two halves
            int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
            int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

            // Recursively sorting both halves
            mergeSort(leftHalf);
            mergeSort(rightHalf);

            // Merging the sorted halves
            merge(arr, leftHalf, rightHalf);
        }
    }

    
    public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;

        // Merge the leftHalf and rightHalf into arr
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] < rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in leftHalf, add them to arr
        while (i < leftHalf.length) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        // If there are remaining elements in rightHalf, add them to arr
        while (j < rightHalf.length) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    // Main method to test the Merge Sort
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Call mergeSort to sort the array
        mergeSort(arr);
        
        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
`````
