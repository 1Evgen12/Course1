package Semestr2.timus.task_1567;

import java.io.*;

public class SMS {
    public static void main(String[] args) throws IOException {
        String inputFileName =
                "C:\\Users\\Evgeniy\\IdeaProjects\\" +
                        "Course1\\src\\Semestr2\\timus\\task_1567\\inputFile.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        String message = bufferedReader.readLine();

        char [] chars = message.toCharArray();
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'a'||chars[i] == 'd'||chars[i] == 'g'||chars[i] == 'j'||
                    chars[i] == 'm'||chars[i] == 'p'||chars[i] == 's'||chars[i] == 'v'||
                    chars[i] == 'y'||chars[i] == '.'||chars[i] == ' ')
                sum+=1;
            else if(chars[i] == 'b'||chars[i] == 'e'||chars[i] == 'h'||chars[i] == 'k'||
                    chars[i] == 'n'||chars[i] == 'q'||chars[i] == 't'||chars[i] == 'w'||
                    chars[i] == 'z'||chars[i] == ',')
                sum+=2;
            else
                sum+=3;
        }

        System.out.println(sum);
    }
}
