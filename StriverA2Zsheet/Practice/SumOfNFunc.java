public class SumOfNFunc {
    public static int sumOfNFunc(int n){
        if(n==0)
            return 0;

        return n + sumOfNFunc(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNFunc(5));
    }
}
