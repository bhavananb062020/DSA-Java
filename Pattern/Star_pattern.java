package Pattern;
import java.util.*;

public class Star_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){           //for inverted star j<= n-i+1
                System.out.print("*"+" ");
            }
            System.out.println();
        }



    }
}