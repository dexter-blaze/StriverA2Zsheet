// public class SumOfN {
//     static int sum = 0;

//     public static void sumOfN(int i, int n){
//         if(i>n){ 
//             return;
//         }
            
//         sum += i;
//         sumOfN(i+1, n);
//     }
//     public static void main(String[] args) {
        
//         sumOfN(1, 10);
//         System.out.println(sum);
//     }
// }

public class SumOfN {

    public static void sumOfN(int i, int n, int sum){
        if(i==n){
            System.out.println(sum+i);
            return;
        }
        sumOfN(i+1, n, sum+i);
    }
    public static void main(String[] args) {
        sumOfN(1, 10, 0);
    }
}
