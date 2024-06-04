import java.util.*;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=0;
        while(n!=0){
            ans++;
            n/=10;
        }
        System.out.println(ans);
    }
}
