public class Re2 {
    private static void printName(int i){
        if(i==0)
            return;
        System.out.println("Abhee");
        printName(i-1);
    }
    public static void main(String[] args) {
        printName(5);
    }
}
