package lab8.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class RW {
    public static void main(String[] args) {

        String str1 = "line1";
        String str2 = "line2";
        double nums[] = new double[]{2.5, 3.5, -4.4, -12.0, 5.5};

        try {
            File file = new File("newfile.txt" );
            File file2 = new File("newfile2.txt");
            file.createNewFile();
            file2.createNewFile();

            PrintWriter writer = new PrintWriter(new FileWriter(file));
            writer.write(str1);
            writer.println();
            writer.write(str2);
            writer.println();

            for (double d:nums) {
                writer.write(String.valueOf(d));
                writer.println();
            }
            writer.flush();
            writer.close();

            BufferedReader in = new BufferedReader(new FileReader(file));
            PrintWriter out = new PrintWriter(new FileWriter(file2));

            for (int i = 0; i < 7; i++) {
                String str = in.readLine();
                if(i==0 | str.contains("-")){
                    continue;
                }
                if(i==1){
                    out.write(str);
                    out.println();
                    System.out.println("Вторая строка [" +str+"] записана");
                }
                else{
                    out.write(str);
                    out.println();
                    System.out.println("число " + str + " записано");
                }
            }

            in.close();
            out.flush();
            out.close();

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
