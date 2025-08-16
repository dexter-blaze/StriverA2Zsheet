public class Re4 {
    static int count = 1;

    public static void printNo(int n){
        if(count==n+1)
            return;
        System.out.println(count);
        count++;
        printNo(n);
    }
    public static void main(String[] args) {
        printNo(7);
    }
}
