package lab1;

import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input year of birth: ");
        int year = input.nextInt();

        int age = 2023 - year;

        System.out.println("You are " + age + " years old.");
        input.close();

    }
}
