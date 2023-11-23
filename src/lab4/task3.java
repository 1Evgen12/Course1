package lab4;
public class task3 {
    public static void main(String[] args) {

        int r = 5;
        int c = 10;
        int array [][] = new int [r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = 2;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
