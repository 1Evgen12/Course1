package lab4;
import java.util.Random;
public class task6 {
    public static void main(String[] args) {
        Random rand = new Random();

        int rows = 3;
        int cols = 5;

        int matrix [][] = new int[rows][cols];
        //заполнение матрицы
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        //вывод матрицы на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //случайные строка и столбец для удаления
        int randRow = rand.nextInt(rows);
        int randCol = rand.nextInt(cols);

        System.out.println("строка для удаления: " + (randRow+1));
        System.out.println("колонка для удаления: " + (randCol+1));

        //удаление строки
        int matrix2 [][] = new int[rows-1][cols];
        for (int i = 0; i < randRow; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = matrix[i][j];
            }
        }
        for (int i = randRow+1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i-1][j] = matrix[i][j];
            }
        }
        //удаление колонки
        int matrix3 [][] = new int[rows-1][cols-1];
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < randCol; j++) {
                matrix3[i][j] = matrix2[i][j];
            }
        }
        for (int i = 0; i < rows-1; i++) {
            for (int j = randCol+1; j < cols; j++) {
                matrix3[i][j-1] = matrix2[i][j];
            }
        }

        //вывод на экран
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < cols-1; j++) {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
