package Array;

public class Binarysearch {
    public static int binary(int[] arr,int key){
        int start=0;
        int end = arr.length -1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 4;
        
        System.out.println("The binary search index is: "+ binary(arr, key));
    }
}
