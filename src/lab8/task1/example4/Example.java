package lab8.task1.example4;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Evgeniy\\IdeaProjects\\semestr1\\src\\lab8\\example4\\My");
        folder.mkdir();
        try{
            File file = new File(folder.getAbsolutePath()+"\\numIsh.txt");
            file.createNewFile();

            Scanner sc = new Scanner(System.in, "cp1251");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(file.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            System.out.println("Введие числа: ");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();

            File file2 = new File(folder.getAbsolutePath()+"\\numRez.txt");
            file2.createNewFile();

            DataInputStream rd = new DataInputStream(new FileInputStream(file.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(file2.getAbsolutePath()));

            try{
                while(true){
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число " + (float)number);
                }
            }catch (EOFException e){}
            wr.flush();
            wr.close();
            rd.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

