import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        Logic
//        String s ="";
//        while(n!=0){
//            if(n%2==0){
//                s+="0";
//            }else s+="1";
//            n/=2;
//        }
//        System.out.println(new StringBuffer(s).reverse());


//        Inbuilt
        System.out.println(Integer.toBinaryString(n));
    }
}
