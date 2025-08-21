public class FindMaximumValue {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]= 54;
        arr[1]= 53;
        arr[2]= -2;
        arr[3]= -4476;
        arr[4]= 21;

        int maxValue = Integer.MIN_VALUE;

        for( int x : arr)
            if(x>maxValue) maxValue = x;

        System.out.println(maxValue);
    }
}
