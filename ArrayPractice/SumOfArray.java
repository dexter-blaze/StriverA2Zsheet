import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int x : arr)
            sum += x;

        System.out.println(sum);

    }
}
