import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int flag=0;
        long ans=0;
        if(x<0){
            flag=1;
            x*=-1;
        }
        while(x!=0){
            ans*=10;
            ans+=x%10;
            x/=10;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE) {
            System.out.println(0);
            System.exit(0);
        }
        if(flag==1){
            ans*=-1;
        }
        System.out.println((int)ans);
        System.exit(0);
    }
}
