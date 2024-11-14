package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortAL3 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(1);
        arr.add(3);

        System.out.println(arr);
        Collections.sort(arr);  // In Acsending order
        System.out.println(arr);

        Collections.sort(arr,Collections.reverseOrder()); // descending order
        System.out.println(arr);
    }
    
}
