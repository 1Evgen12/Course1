package lab3;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Введите день недели с маленькой буквы:");
            String day = in.nextLine();
            switch (day){
                case "понедельник":
                    System.out.println(1);
                    return;
                case "вторник":
                    System.out.println(2);
                    return;
                case "среда":
                    System.out.println(3);
                    return;
                case "четверг":
                    System.out.println(4);
                    return;
                case "пятница":
                    System.out.println(5);
                    return;
                case "суббота":
                    System.out.println(6);
                    return;
                case "воскресенье":
                    System.out.println(7);
                    return;
                default:
                    System.out.println("Нет такого дня");
            }
        }
    }
}
