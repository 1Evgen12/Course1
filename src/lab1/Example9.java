package lab1;

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input month: ");
        String month = in.nextLine();

        System.out.print("Input count days: ");
        int count = in.nextInt();

        System.out.println("There are " + count + " days in " + month);
        in.close();
    }
}
