// Recursive Code(functional)
// public class FactN {
//     public static int factN(int n){
//         if(n==1)
//             return 1;

//         return n * factN(n - 1);
//     }
//     public static void main(String[] args) {
//         System.out.println(factN(5));
//     }
// }
// recursion(parameterized)

public class FactN {
    public static void factN(int n, int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }


        factN(n-1, fact*n);
    }
    public static void main(String[] args) {
        factN(5,1);
    }
}