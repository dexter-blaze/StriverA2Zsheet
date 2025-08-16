import java.util.*;

public class LUE {
	
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
        	x = scanner.nextInt();
            if(x==42)
                break;
                
        	System.out.println(x);
        }
    }
}
