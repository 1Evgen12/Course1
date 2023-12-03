package timus.task_1313;

import java.util.Scanner;

public class QustionOfSport {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int pixels [][]= new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                pixels[i][j] = in.nextInt();
            }
        }

        int c=0;
        exit: for (int i = 0;; i++) {
                int I = i;
                for (int j = c; j<=I & j < N; j++) {
                    System.out.print(pixels[i][j]+" ");
                    if(i == N-1 & j == N-1)
                        break exit;
                    i--;
                }
                i = I;
                if(i+1==N) {
                    i--;
                    c++;
                }
        }
    }
}
