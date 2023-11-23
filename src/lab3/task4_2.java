package lab3;

import java.util.Scanner;

public class task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        if (a > b){
            int t = a;
            a = b;
            b = t;
        }

        do{
            System.out.print(a++ + " ");
        }
        while (a <= b);

    }
}
