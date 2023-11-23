package lab3;

import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер последовательности чисел Фибоначчи: ");
        int size = in.nextInt();
        if (size <= 0)
            return;

        long fibonachi [] = new long [size];
        int index = 2;

        while (size > index){

            fibonachi[0] = 1;
            fibonachi[1] = 1;
            fibonachi[index] = (fibonachi[index-2] + fibonachi[index-1]);
            index++;
        }

        if (size == 1) {
            fibonachi[0] = 1;
        }
        else if(size == 2){
            fibonachi[1] = 1;
            fibonachi[0] = 1;
        }

        for (int i = 0; i < fibonachi.length; i++) {
            System.out.print(fibonachi[i]+ " ");
        }
    }
}
