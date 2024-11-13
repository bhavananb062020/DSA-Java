package Array;

public class kadanes {
    public static void kadane(int[] arr){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            if(cs <0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        kadane(arr);
    }
}
