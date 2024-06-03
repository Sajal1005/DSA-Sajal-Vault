import java.util.*;

public class PatternsQuestions {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        1.
//        ****
//        ****
//        ****
//        ****

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        2.
//        *
//        **
//        ***
//        ****

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        3.
//        1
//        12
//        123
//        1234

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }


//        4.
//        1
//        22
//        333
//        4444

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }


//        5.
//        ****
//        ***
//        **
//        *

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        6.
//        1234
//        123
//        12
//        1
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }


//        7.
//           *
//          ***
//         *****
//        *******

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        8.
//        *******
//         *****
//          ***
//           *
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*n-1-2*i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        9.
//           *
//          ***
//         *****
//        *******
//         *****
//          ***
//           *

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*n-3-2*i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        10.
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        11.
//        1
//        0 1
//        1 0 1
//        0 1 0 1

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                if((i+j)%2==0){
//                    System.out.print(1+" ");
//                }else{
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }


//        12.
//        1      1
//        12    21
//        123  321
//        12344321

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(j+1);
//            }
//            for(int j=0;j<2*n-2-2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print(i+1-j);
//            }
//            System.out.println();
//        }


//        13.
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

//        int k=1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print((k++)+" ");
//            }
//            System.out.println();
//        }


//        14.
//        A
//        AB
//        ABC
//        ABCD
//        ABCDE

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print((char)(65+j));
//            }
//            System.out.println();
//        }


//        15.
//        ABCDE
//        ABCD
//        ABC
//        AB
//        A

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print((char)(65+j));
//            }
//            System.out.println();
//        }


//        16.
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print((char)(65+i));
//            }
//            System.out.println();
//        }


//        17.
//        A
//        ABA
//        ABCBA
//        ABCDCBA

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print((char)(65+j));
//            }
//            for(int j=0;j<i;j++){
//                System.out.print((char)(64+i-j));
//            }
//            System.out.println();
//        }


//        18.
//        E
//        D E
//        C D E
//        B C D E
//        A B C D E

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print((char)(64+n-i+j)+" ");
//            }
//            System.out.println();
//        }

//        19.
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*n-2*i-2;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        20.
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*n-2*i-2;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*i+2;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        21.
//        ****
//        *  *
//        *  *
//        ****

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==0 || j==0 || i==n-1 || j==n-1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        22.
//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444

//        for(int i=0;i<2*n-1;i++){
//            for(int j=0;j<2*n-1;j++){
//                int k = Math.min(Math.min(i,j),Math.min(2*n-i-2,2*n-j-2));
//                System.out.print(n-k);
//            }
//            System.out.println();
//        }


        
    }
}
