package Sorting;

public class Bubblesort {
    public static void bubble(int[] arr){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        int[] arr = {4,3,6,1,8};
        bubble(arr);
        printarr(arr);
    }
}
