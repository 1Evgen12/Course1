package lab3;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size;
        while(true){
            System.out.print("Введите размер массива: ");
            size = in.nextInt();
            if(size < 1){
                continue;
            }
            else if(size > 13)
                size = 13;
            break;

        }

        char symbols [] = new char [size];
        int count = 0;


        for (char i = 'a'; count < size; i++) {
            if(i % 2 != 0)
                symbols[count++] = i;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(symbols[i] + " ");
        }
        System.out.print("\n");
        for (int i = size-1; i >= 0 ; i--) {
            System.out.print(symbols[i] + " ");
        }


    }
}
