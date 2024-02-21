package lab8.task1.example7;

import java.io.*;

public class Buf_RW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\Evgeniy\\IdeaProjects\\semestr1\\src\\lab8\\example7\\file1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("C:\\Users\\Evgeniy\\IdeaProjects\\semestr1\\src\\lab8\\example7\\file2.txt"));

            int lineCount=0;
            String s;
            while ((s = br.readLine())!= null){
                lineCount++;
                System.out.println(lineCount + ": "+s);
                out.write(s);
                out.newLine();
            }

        }catch (IOException e){
            System.out.println(e);
        }finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
