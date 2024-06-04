import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

//        Using iteration
//        int ans=1;
//        for(int i=Math.min(n1,n2);i>=1;i--){
//            if(n1%i==0 && n2%i==0){
//                ans=i;
//                break;
//            }
//        }
//        System.out.println(ans);


//        Using Euclidean => keep on subtracting smaller number from larger number until one number is not 0, The other number is your answer
        while(n1>0 && n2>0){
            if(n1>n2){
                n1%=n2;
            }else{
                n2%=n1;
            }
        }
        if(n1!=0) System.out.println(n1);
        else System.out.println(n2);

    }
}
