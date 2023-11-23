package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class task5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел: ");
        int n = in.nextInt();
        int arr [] = new int[n];
        int number = 0;
        int index = 0;
        while (index < n){
            if((number % 5 == 2) | (number % 3 == 1)){
                arr[index++] = number;
            }
            number++;
        }

        System.out.println("Числа: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nСумма чисел: ");
        System.out.println(Arrays.stream(arr).sum());
    }
}
