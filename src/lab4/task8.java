package lab4;
import java.util.Scanner;
public class task8 {
    public static String getCypher (String text, int shift){
        char[] arrayChar = text.toCharArray();
        int[] arrayInt = new int [arrayChar.length];
        char[] arrayNewChar = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayNewChar[i] = (char) arrayInt[i];
        }
        text = new String(arrayNewChar);
        return  text;
    }
    public static String getDecypher (String text, int shift){
        char[] arrayChar = text.toCharArray();
        int[] arrayInt = new int [arrayChar.length];
        char[] arrayNewChar = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] - shift;
            arrayNewChar[i] = (char) arrayInt[i];
        }
        text = new String(arrayNewChar);
        return  text;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = scan.nextLine();
        System.out.print("Введите ключ: ");
        int key = scan.nextInt();
        String encryptedText = getCypher(text, key);
        System.out.println("Текст после преобразования: "+ encryptedText);
        System.out.print("Выполнить обратное преобразование? (y/n) ");
        String ch;
        do {
            ch = scan.next();
            if (ch.equals("y")) {
                String decryptedText = getDecypher(encryptedText, key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (ch.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.print("Введите корректный ответ: ");
            }
        }while (!(ch.equals("y") | ch.equals("n")) );
    }
}
