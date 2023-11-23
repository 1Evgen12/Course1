package lab3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int size;
        while(true){
            System.out.println("Введите размер массива: ");
            size = in.nextInt();
            if(size < 1)
                continue;
            break;
        }

        int array []= new int [size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(30);
        }
        System.out.println("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        array = Arrays.stream(array).sorted().toArray();
        for (int i = 0, j = size-1; i < size/2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("\nмассив в порядке убывания:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
