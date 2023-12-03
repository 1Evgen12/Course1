package timus.task_2012;

import java.util.Scanner;

public class Grisha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();

        if (12-f > 5)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
