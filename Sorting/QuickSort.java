package Sorting;

public class QuickSort {
    public static void quick(int arr[], int low, int high) {

        if (low < high) {
            int pivotIndex = partiotion(arr, low, high);
            quick(arr, low, pivotIndex - 1);
            quick(arr, pivotIndex + 1, high);

        }
    }

    public static int partiotion(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        int temp;
        do {
            while (arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        } while (i < j);

        temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int n = array.length;
        
        System.out.println("Unsorted Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        
        quick(array, 0, n - 1);

        System.out.println("\nSorted Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
