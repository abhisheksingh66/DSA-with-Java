package Sorting;

public class BubbleSort {

    static void bubbleSorting(int[] array) {
        int n = array.length;
        boolean swapped;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            swapped =false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped= true;

                }

            }
            if (!swapped)break;

        }
    }

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        // int[] array = { 1,2,3,4,5,6,7,8,9,10 };
        System.out.println("Unsorted Array : ");
        for (int array2 : array) {
            System.out.print(array2 + " ");
        }
        bubbleSorting(array);
        System.out.println("\nSorted array:");
        for (int array2 : array) {
            System.out.print(array2 + " ");
        }
    }
}
