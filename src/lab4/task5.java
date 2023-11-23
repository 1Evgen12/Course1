package lab4;
import java.util.Random;
public class task5 {
    public static void main(String[] args) {
        int r = 3;
        int c = 5;

        Random rand = new Random();
        int array [][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------");

        int array2 [][] = new int[c][r];
        for (int row = 0; row < c; row++) {
            for (int col = 0; col < r; col++) {
                array2[row][col] = array[col][row];
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
