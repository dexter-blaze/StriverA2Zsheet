import java.util.Scanner;
import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }

        int k=arr[0];
        //Logic
        for (int i = 1; i < arr.length; i++){
            if(k<arr[i])
                k=arr[i];
        }
        System.out.println(k);
    }
}
