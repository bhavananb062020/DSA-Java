package ArrayList;

import java.util.ArrayList;

public class swap4 {
    public static void swapnum(ArrayList<Integer> arr,int ind1,int ind2){
        int temp = arr.get(ind1);
        arr.set(ind1,arr.get(ind2));
        arr.set(ind2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr);
        swapnum(arr,2,3);
        System.out.println(arr);
    }
    
}
