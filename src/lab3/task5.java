package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел: ");
        int n = in.nextInt();

        int arr [] = new int[n];


        for (int i = 0, j = 0; i < 300; i++) {
            if((i % 5 == 2) | (i % 3 == 1)){
                arr[j] = i;
                j++;
                if(j == n)
                    break;
            }
        }
        System.out.println("Числа: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nСумма чисел: ");
        System.out.println(Arrays.stream(arr).sum());
    }
}
