import java.util.*;

public class Printing {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for( int x : arr){
            System.out.println(x);
        } 
    }    
}
