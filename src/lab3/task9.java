package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int size;
        while(true){
            System.out.println("Введите размер массива: ");
            size = in.nextInt();
            if(size < 1)
                continue;
            break;
        }

        int array []= new int [size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(51);
            System.out.print(array[i] + " ");
        }
        int min = Arrays.stream(array).min().hashCode();

        System.out.println();
        System.out.print("мин = " + min + "; индексы: ");

        for (int i = 0; i < size; i++) {
            if(array[i] == min){
                System.out.print(i + ", ");
            }
        }
        System.out.print("\b\b");
    }
}
