package lab4;

public class task1 {
    public static void main(String[] args) {

        int height = 11;
        int width = 23;

        for (int i = 0; i < height; i++) {
        int c = 0;
            System.out.print(i + 1 + "\t ");
            for (int j = 0; j < width; j++) {
                System.out.print("*");
                c++;
            }
            System.out.println("\t" + c);
        }
    }
}
