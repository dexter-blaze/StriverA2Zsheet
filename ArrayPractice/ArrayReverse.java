import java.util.*;

public class ArrayReverse {
    public static void main(String[] args){
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length - 1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
