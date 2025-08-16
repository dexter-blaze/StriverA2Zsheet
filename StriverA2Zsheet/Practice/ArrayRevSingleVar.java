public class ArrayRevSingleVar {
    static int[] a = {1,2,3,4,5};
    static int n = a.length;
    public static void arrayRevSingleVar(int i){
        if(i>n/2)
            return;
        swap(i,n-i-1);
        arrayRevSingleVar(i+1);
    }

    public static void swap(int l, int r){
        int temp = a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void main(String[] args) {
        arrayRevSingleVar(0);
        for (int x : a){
            System.out.println(x);
        }
    }
}
