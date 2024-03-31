package Semestr2.timus.task_1787;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Mega {
    public static void main(String[] args) {
        String inputFileName =
                "C:\\Users\\Evgeniy\\IdeaProjects\\Course1\\src\\Semestr2" +
                        "\\timus\\task_1787\\inputFile.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        try{
            BufferedReader bufferedReader =
                    oj? new BufferedReader(new InputStreamReader(System.in)):
            new BufferedReader(new FileReader(inputFileName));

            String readline = bufferedReader.readLine();
            String [] strings = readline.split(" ");

            int k = Integer.parseInt(strings[0]);
            int n = Integer.parseInt(strings[1]);
            int result = 0;

            readline = bufferedReader.readLine();
            strings = readline.split(" ");

            for (int i = 0; i < strings.length; i++) {
                int cars = Integer.parseInt(strings[i]);
                result += (cars - k);
                if(result < 0)
                    result = 0;
            }
            System.out.println(result);

        }catch (IOException exception){
            exception.printStackTrace();
        }

        /*Scanner in = new Scanner(System.in);
            int k = in.nextInt();
            int n = in.nextInt();
            int result = 0;

        for (int i = 0; i < n; i++) {
            result += in.nextInt() - k;
            if(result < 0)
                result = 0;
        }

        System.out.println(result);*/
    }
}
