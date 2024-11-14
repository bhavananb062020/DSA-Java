package ArrayList;

import java.util.ArrayList;

// Bruteforce approach
public class pairsumTarget5 {

    public static boolean pairsum(ArrayList<Integer> arr,int target){
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i) + arr.get(j) == target){
                    return true;

                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(4);

        boolean target = pairsum(arr, 6);
        System.out.println(target);
        
    }
    
}
