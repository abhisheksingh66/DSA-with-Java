package Sorting;

public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        // Merge both halves into merged array
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of the left half, if any
        while (i <= mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements of the right half, if any
        while (j <= high) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        // Copy merged array back into the original array
        for (k = 0; k < merged.length; k++) {
            arr[low + k] = merged[k];
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            // Recursively divide and sort the left half
            mergeSort(arr, low, mid);

            // Recursively divide and sort the right half
            mergeSort(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Unsorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
