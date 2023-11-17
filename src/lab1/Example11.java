package lab1;

import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input year of birth: ");
        int year = in.nextInt();
        int age = 2023 - year;

        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        in.close();
    }
}
