package lab3;

import java.util.Scanner;

public class dayOfWeek2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.println("Введите день недели с маленькой буквы:");
            String day = in.nextLine();

            if(day.equals("понедельник") ) {
                System.out.println(1);
                break;
            }
            else if(day.equals ("вторник")) {
                System.out.println(2);
                break;
            }
            else if(day.equals ("среда")) {
                System.out.println(3);
                break;
            }
            else if(day.equals ("четверг")) {
                System.out.println(4);
                break;
            }
            else if(day.equals ("пятница")) {
                System.out.println(5);
                break;
            }
            else if(day.equals ("суббота")) {
                System.out.println(6);
                break;
            }
            else if(day.equals ("воскресенье")) {
                System.out.println(7);
                break;
            }
            else
                System.out.println("Нет такого дня");
        }
    }
}

