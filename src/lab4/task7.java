package lab4;
import java.util.Random;
public class task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rows = 5, cols = 8;

        char matrix [][] = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = '0';
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        for(int i = 0, j = 0, c = cols; i < rows; i++, c--) {
            System.out.println("-----------");
            for (j=0; j < c; j++) {
                matrix[i][j] = '*';
            }
            for (int k = rows-1, l = j-1; k>i  ; k--) {
                matrix[k][l] = '*';
            }
            for (int t = 0; t < rows; t++) {
                for (int y = 0; y < cols; y++) {
                    System.out.print(matrix[t][y]);
                }
                System.out.println();
            }
        }
    }
}
