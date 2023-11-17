package timus.task_1293;

import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        in.close();

        int result = ((A*B)*2)*N;

        System.out.println(result);

    }
}
