package Array;

public class MaxSubarray {
    public static int maxsub(int[] arr){
        int currsum =  0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum =0;
                for(int k=i;k<=j;k++){
                    currsum += arr[k];
                }
                if(currsum > maxsum){
                    maxsum = currsum;
                }
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int maxsum = maxsub(arr);
        System.out.println(maxsum);
    }
    
}
