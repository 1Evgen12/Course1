package timus.task_1785;

import java.util.Scanner;

public class LocalizationProblem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if(1<=N & N <=4)
            System.out.println("few");
        else if  (5<=N & N <=9)
            System.out.println("several");
        else if  (10<=N & N <=19)
            System.out.println("pack");
        else if  (20<=N & N <=49)
            System.out.println("lots");
        else if  (50<=N & N <=99)
            System.out.println("horde");
        else if  (100<=N & N <=249)
            System.out.println("throng");
        else if  (250<=N & N <=499)
            System.out.println("swarm");
        else if  (500<=N & N <=999)
            System.out.println("zounds");
        else if  (N > 1000)
            System.out.println("legion");
    }
}
