public class ArrayRev {
    static int[] a = {1,2,3,4,5};
    public static void arrayRev(int l, int r){
        if(l>=r)
            return;

        swap(l,r);
        arrayRev(l+1, r-1);
        
    }

    public static void swap(int l, int r){
        int temp = a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void main(String[] args) {
        
        arrayRev(0,4);
        for (int x: a){
            System.out.print(x + ",");
        }
            
    }
}
