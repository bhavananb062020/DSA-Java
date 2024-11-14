package Array;

public class Linearsearch2 {
    public static void linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int key = 5;
        linear(arr, key);
    }
}
