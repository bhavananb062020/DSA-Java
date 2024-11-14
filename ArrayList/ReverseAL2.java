package ArrayList;

import java.util.ArrayList;

public class ReverseAL2 {
   
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
       
        System.out.println(arr);
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
       



    }


    
}
