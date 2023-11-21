package lab3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер последовательности чисел Фибоначчи: ");
        int size = in.nextInt();
        if(size <= 0)
            return;

        long fibonachi [] = new long [size];

        if (size == 1) {
            fibonachi[0] = 1;
        }
        else if(size == 2){
            fibonachi[1] = 1;
            fibonachi[0] = 1;
        }
        else {
            fibonachi[1] = 1;
            fibonachi[0] = 1;
        }

        for (int i = 2; i < size; i++) {
            fibonachi[i] = fibonachi[i-2] + fibonachi[i-1];
        }
        for (int i = 0; i < fibonachi.length; i++) {
            System.out.print(fibonachi[i]+ " ");
        }

    }
}
