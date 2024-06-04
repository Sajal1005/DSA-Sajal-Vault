import java.util.*;

public class BinToDec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        Logic
//        int ans=0,count=0;
//        while(n!=0){
//            ans+=(Math.pow(2,count++)*(n%10));
//            n/=10;
//        }
//        System.out.println(ans);

//        Inbuilt
        System.out.println(Integer.parseInt(n+"",2));
    }
}
