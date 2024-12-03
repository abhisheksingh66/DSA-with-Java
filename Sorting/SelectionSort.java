package Sorting;

public class SelectionSort {

    public static void selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;  

        }

    }

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Unsorted Array : ");
        for (int array2 : array) {
            System.out.print(array2 + " ");
        }
        selection(array);
        System.out.println("\nSorted array:");
        for (int array2 : array) {
            System.out.print(array2 + " ");
        }
    }
}
