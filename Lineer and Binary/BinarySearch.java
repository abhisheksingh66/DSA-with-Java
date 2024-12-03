public class BinarySearch {


public static int binarysearch(int[] arr,int value){

    int low,mid,high;
    low=0;
    high=arr.length-1;
    while (low<=high) {
        mid=(low+high)/2;

    if (arr[mid]==value) {
        return mid;
    }else if(arr[mid]>value){
        low=mid+1;
    }else{
        high=mid-1;
    }
    }
    return -1;
}






    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,12,16,19,21,25,28,30,31};
        int value=13;
        
        int searchIndex=binarysearch(arr,value);


        if (searchIndex != -1) {
            System.out.println("Element " + value + " was found at index " + searchIndex);
        } else {
            System.out.println("Element " + value + " not found in the array");
        }
    }
}
