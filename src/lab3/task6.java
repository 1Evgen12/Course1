package lab3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size;
        while(true){
            System.out.println("Введите размер числового массива: ");
            size = in.nextInt();
            if(size < 1) {
                continue;
            }
            break;
        }
        int number = 0;
        int count = 0;
        int array [] = new int[size];

        while (count < size){
            if(number % 5 == 2){
                array[count++] = number;
            }
            number++;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
