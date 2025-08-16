public class NToOneUsingBackTracking {
    public static void nToOne(int i, int n){
        if(i==n)
            return;
        i++;
        nToOne(i,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        nToOne(0,7);
    }
}
