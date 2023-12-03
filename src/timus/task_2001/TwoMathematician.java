package timus.task_2001;

import java.util.Scanner;

public class TwoMathematician {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int res2 = b1-b2;
        int res1 = a1-a3;
        System.out.println(res1 + " " + res2);
    }
}
