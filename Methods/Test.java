 class Test {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(upperFun("    Hi Everyone!    "));
        System.out.println(sum(1,2,3));
    }

    public static int sumOfArray(int[] arr){
        int res = 0;
        for(int x : arr){
            res+=x;
        }
        return res;
    }

    private static String upperFun(String str){
        return str.trim().toUpperCase();
    }

    private static int sum(int a, int b){
        return a + b;
    }

    private static int sum(int a, int b, int c){
        return a + b + c;
    }
}
