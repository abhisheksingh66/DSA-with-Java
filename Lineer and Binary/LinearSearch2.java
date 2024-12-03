
public class LinearSearch2 {
public static int Linear(int[] arr,int value){
    for(int i=0;i<arr.length;i++){
         if (arr[i]==value) {
            return 1;
         }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[]={ 12, 35, 6, 78, 2, 4, 13, 5, 86, 17 };
        int value=13;
        int searchIndex=Linear(arr,value);
        
        if (searchIndex != -1) {
            System.out.println("Element " + value + " was found at index " + searchIndex);
        } else {
            System.out.println("Element " + value + " not found in the array");
        }
    }
}