public class Re1 {
    public static void func(int i){
        if(i==0)
            return;
        
        System.out.println(i);
        func(i-1);
    }
    
    public static void main(String[] args) {
        func(10);
    }
}
