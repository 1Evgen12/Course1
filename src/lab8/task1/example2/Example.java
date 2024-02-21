package lab8.task1.example2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {
    public static void readAllByByte(InputStream in) throws IOException{
        while(true){
            int oneByte = in.read();
            if(oneByte !=-1){
                System.out.print((char)oneByte);
            }
            else{
                System.out.print("end");
                break;
            }
        }
    }
    public static void readAllByByte(ByteArrayInputStream in) throws IOException{
        while(true){
            int oneByte = in.read();
            if(oneByte !=-1){
                System.out.println(oneByte);
            }
            else{
                System.out.print("end");
                break;
            }
        }
    }

    public static void main(String[] args)  {
        try{
//            InputStream inFile = new FileInputStream("D:\\MyFile1.txt");
//            readAllByByte(inFile);
//            inFile.close();

//            InputStream inURL = new URL("http://google.com").openStream();
//            readAllByByte(inURL);
//            System.out.println();
//            inURL.close();

            ByteArrayInputStream inArray = new ByteArrayInputStream(new byte[]{6,5,2,9,1,0});
            readAllByByte(inArray);
            System.out.println();
            inArray.close();

        }catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}
