package lab8.task1.example6;

import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try{
            in = new FileReader("C:\\Users\\Evgeniy\\IdeaProjects\\semestr1\\src\\lab8\\example6\\file1.txt");
            out = new FileWriter("C:\\Users\\Evgeniy\\IdeaProjects\\semestr1\\src\\lab8\\example6\\file2.txt", true);

            int oneByte;
            while ((oneByte = in.read())!= -1){
                out.write((char)oneByte);
                //out.append((char) oneByte);
                System.out.print((char) oneByte);
            }

        }catch (IOException e){
            System.out.println(e);
        }finally {
            System.out.println();
            in.close();
            out.close();
        }
    }
}
