package lab4;
public class task2 {
    public static void main(String[] args) {

        int height = 10;
        int width = 5;

       for (int i = 1; i < height & i <= width; i++) {
            int c = 0;
            System.out.print(i + "\t ");
            for (int j = 0; j < width & j < i; j++) {
                System.out.print("*");
                c++;
            }
            System.out.println();
        }
    }
}
