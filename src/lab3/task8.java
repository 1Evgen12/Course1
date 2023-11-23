package lab3;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char letters [] = new char[10];
        int index = 0;
        for (char ch = 'B'; index < 10; ch++) {
            if(ch == 'E'| ch == 'I' | ch == 'O' | ch == 'U' | ch == 'Y')
                continue;
            letters[index++] = ch;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(letters[i] + " ");
        }
    }
}
