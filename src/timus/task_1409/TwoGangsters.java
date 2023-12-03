package timus.task_1409;

import java.util.Scanner;

public class TwoGangsters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int G = in.nextInt();
        int L = in.nextInt();
        int sum = G + L-1;
        System.out.print((sum - G) + " " + (sum -L));
    }
}
