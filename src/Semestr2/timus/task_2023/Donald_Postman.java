package Semestr2.timus.task_2023;

import java.io.*;

public class Donald_Postman {
    public static void main(String[] args) throws IOException {
        String inputFileName =
                "C:\\Users\\Evgeniy\\IdeaProjects\\" +
                        "Course1\\src\\Semestr2\\timus\\task_2023\\inputFile.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        int steps = 0, position = 0;
        int countLetters = Integer.parseInt(bufferedReader.readLine());//количество писем

        for (int i = 0; i < countLetters; i++) {
            String name = bufferedReader.readLine();

            if((name.charAt(0)=='A'|| name.charAt(0)=='P'||name.charAt(0)=='O'||name.charAt(0)=='R')&&(position==1)){
                position = 0;
                steps++;
            }
            else if((name.charAt(0)=='A'|| name.charAt(0)=='P'||name.charAt(0)=='O'||name.charAt(0)=='R')&&(position==2)){
                position = 0;
                steps+=2;
            }
            else if((name.charAt(0)=='B'|| name.charAt(0)=='M'||name.charAt(0)=='S')&&(position==0||position==2)){
                position = 1;
                steps++;
            }
            else if((name.charAt(0)=='D'|| name.charAt(0)=='G'||name.charAt(0)=='J'||name.charAt(0)=='K'||
                    name.charAt(0)=='T'||name.charAt(0)=='W')&&(position==0)){
                position = 2;
                steps+=2;
            }else if((name.charAt(0)=='D'|| name.charAt(0)=='G'||name.charAt(0)=='J'||name.charAt(0)=='K'||
                    name.charAt(0)=='T'||name.charAt(0)=='W')&&(position==1)){
                position = 2;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
