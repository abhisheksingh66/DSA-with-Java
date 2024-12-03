package Sorting;

public class Insertionsort {



public static void Insertion(int[] arr){
    int n=arr.length;
    for(int i=1;i<n;i++){
        int key=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>key) {
            arr[j+1]=arr[j];
            j--;
            
        }
        arr[j+1]=key;
    }
}







    public static void main(String[] args) {
          int[] array = { 64, 34, 25, 12, 22, 11, 90 };
          System.out.println("Unsorted Array : ");
          for (int array2 : array) {
              System.out.print(array2 + " ");
          }
          Insertion(array);
          System.out.println("\nSorted array:");
          for (int array2 : array) {
              System.out.print(array2 + " ");
          }
    }
}
