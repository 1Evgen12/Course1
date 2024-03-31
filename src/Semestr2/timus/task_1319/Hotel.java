package Semestr2.timus.task_1319;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int [][]matrix = new int[n][n];

        int counter = 1, diagonal=1, countInDiagonal = 0;
        //заполнение матрицы над побочной диагональю
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n-1){
                    if(countInDiagonal<diagonal) {
                        if (i + j == diagonal - 1) {
                            matrix[i][j] = counter;
                            counter++;
                            countInDiagonal++;
                        }
                    }else{
                        countInDiagonal=0; i=0; j=0;
                        diagonal++;
                    }
                }else{
                    break;
                }
            }
        }
        //заполнение матрицы в побочной диагонали

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n-1){
                        matrix[i][j] = counter;
                    counter++;
                    }
            }
        }
        countInDiagonal=0;
        diagonal+=2;
        
        //заполнение матрицы под побочной диагональю
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j > n-1){
                    if(countInDiagonal<n+n-diagonal) {
                        if (i + j == diagonal-1) {
                            matrix[i][j] = counter;
                            counter++;
                            countInDiagonal++;
                        }
                    }else{
                        countInDiagonal=0; i=0; j=0;
                        diagonal++;
                    }
                }
            }
        }
        //вывод в консоль зеркально
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0; j--) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
