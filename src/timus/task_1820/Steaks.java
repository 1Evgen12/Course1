package timus.task_1820;

import java.util.Scanner;

public class Steaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  n = scanner.nextInt();
        double k = scanner.nextInt();
        if(k>=n){
            System.out.println(2);
        }
        else{
            int res = (int)Math.ceil((n*2)/k);
            System.out.println(res);
        }
    }
}
