package Array;

public class prefixsum8 {
    public static int prefix(int[] arr){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1;i < prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum = i==0 ? prefix[j] : prefix[j] -prefix[i-1];
            }
            if(currsum > maxsum){
                maxsum = currsum;
            }
        }
        return maxsum;

    }
    
     
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int prefixsum = prefix(arr);
        System.out.println(prefixsum);

    }
}
