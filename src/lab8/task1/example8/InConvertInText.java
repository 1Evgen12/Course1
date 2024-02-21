package lab8.task1.example8;

import java.io.*;
import java.net.URL;

public class InConvertInText {
    public static void readAllByByte(Reader in) throws IOException {
        while(true){
            int oneByte = in.read();
            if(oneByte !=-1){
                System.out.print((char)oneByte);
            }
            else{
                break;
            }
        }
    }

    public static void main(String[] args)  {
        try{
            InputStream inFile = new FileInputStream("D:\\MyFile1.txt");

            Reader rFile = new InputStreamReader(inFile, "cp1251");
            readAllByByte(rFile);
            System.out.println();
            inFile.close();
            rFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();

            Reader rUrl = new InputStreamReader(inUrl, "cp1251");

            readAllByByte(rUrl);
            System.out.println();
            inUrl.close();
            rUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{6,5,2,9,1,0});

            Reader rArray = new InputStreamReader(inArray, "cp1251");

            readAllByByte(rArray);
            System.out.println();
            inArray.close();
            rArray.close();

        }catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}
