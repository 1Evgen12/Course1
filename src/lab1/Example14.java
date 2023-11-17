package lab1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = in.nextInt();
        int sum = number + (number-1) + (number + 1);
        int sqr = sum * sum;

        System.out.println((number - 1) + " " + number + " " + (number + 1) + " " + sqr);
        in.close();
    }
}
