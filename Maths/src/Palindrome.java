import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=0,x=n;
        while(n!=0){
            ans*=10;
            ans+=(n%10);
            n/=10;
        }
        System.out.println(ans==x);
    }
}
