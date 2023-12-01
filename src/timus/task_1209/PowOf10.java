package timus.task_1209;

import java.util.Scanner;

public class PowOf10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long positions [] = new long[N];
        for (int i = 0; i < N; i++) {
            positions[i] = in.nextLong();
        }

        for (int i = 0; i < N; i++) {

            long res = (long)Math.sqrt((positions[i]-1)*8+1);

            if(res*res == ((positions[i]-1)*8+1)){
                System.out.print(1+" ");
            }
            else
                System.out.print(0+" ");
        }


//TLE
//        int indicesOf1 [] = new int[1000000];
//        int q = 1;
//        for (int i = 1; i < 1000000; i++) {
//            indicesOf1[i]= indicesOf1[i-1]+q;
//            q++;
//        }
//
//        for (int i = 0; i < N; i++){
//            link:{
//            for (int j = 0; j < 1000000; j++) {
//                if(indicesOf1[j] == positions[i]-1){
//                  System.out.print(1+" ");
//                 break link;
//                }
//                if(indicesOf1[j] > positions[i]-1)
//                    break;
//            }
//            System.out.print(0 + " ");}
//        }
    }
}
