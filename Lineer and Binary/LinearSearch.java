public class LinearSearch {

    public static int Linears(int[] arr, int elemnt) {

        for (int i = 0; i <= arr.length; i++) {

            if (arr[i] == elemnt) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 12, 35, 6, 78, 2, 4, 13, 5, 86, 17 };
        int element = 4;
        int searchIndex = Linears(arr, element);

        if (searchIndex != -1) {
            System.out.println("Element " + element + " was found at index " + searchIndex);
        } else {
            System.out.println("Element " + element + " not found in the array");
        }

    }
}
