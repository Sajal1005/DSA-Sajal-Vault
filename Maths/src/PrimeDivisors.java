import java.util.*;

public class PrimeDivisors {
    public static boolean prime(int n) {
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0 && prime(i)){
                System.out.println(i);
            }
        }
    }
}
