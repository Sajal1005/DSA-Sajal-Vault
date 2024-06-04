import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=(n+"").length();
        int sum=0,x=n;
        while(n!=0){
            sum+=(Math.pow(n%10,count));
            n/=10;
        }
        System.out.println(x==sum);
    }
}
