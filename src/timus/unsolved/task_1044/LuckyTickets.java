package timus.unsolved.task_1044;

import java.util.Arrays;
import java.util.Scanner;

class CheckNumber {

    int N;
    int secondPart [];
    int firstPart [];

    CheckNumber(int N){
        this.N = N;
        secondPart = new int[N/2];
        firstPart = new int[N/2];
    }

    boolean isLucky (int number){

        for (int i = 0; i < N/2; i++) {
            secondPart[i] = number % 10;
            number /= 10;
        }

        for (int i = N/2; i < N; i++) {
            firstPart[i-N/2] = number % 10;
            number /= 10;
        }

        if(Arrays.stream(firstPart).sum() == Arrays.stream(secondPart).sum()){
            return true;
        }
        else
            return false;
    }
}

public class LuckyTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 0;
        int maxNumber = (int)Math.pow(10, N);
        CheckNumber check = new CheckNumber(N);
        for (int i = (int)Math.sqrt(maxNumber); i < maxNumber; i++) {
            if (check.isLucky(i))
                count++;
        }
        System.out.println(++count);
    }
}
