package Sorting;

public class Insertionsort {

    public static void insertion(int[] arr){
        for(int i=0;i<arr.length;i++){
            int curr = i;
            int prev = i-1;

            //Finding the correct position to insert
            while (prev >=0 && arr[prev] > arr[curr] ) {
                arr[prev + 1] = arr[prev];
                prev--;
                
            }
            //Insertion
            arr[prev +1] = arr[curr];
        }
    }
        public static void printarr1(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            
        }
    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        insertion(arr);
        printarr1(arr);
    }
    
} 
