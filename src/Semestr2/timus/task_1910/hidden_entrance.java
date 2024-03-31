package Semestr2.timus.task_1910;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class hidden_entrance {
    public static void main(String[] args) throws IOException {
        String inputFileName =
                "C:\\Users\\Evgeniy\\IdeaProjects\\" +
                        "Course1\\src\\Semestr2\\timus\\task_1910\\inputFile.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        int n = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");

        int [] sums = new int[n-2];

        for (int i = 0; i < sums.length; i++) {
            sums[i] = Integer.parseInt(strings[i]) +
                    Integer.parseInt(strings[i+1])+
                    Integer.parseInt(strings[i+2]);
        }

        int [] sumsCopy = Arrays.copyOf(sums, sums.length);
        Arrays.sort(sumsCopy);

        int value1 = sumsCopy[sumsCopy.length-1];

        for (int i = 0; i < sums.length; i++) {
            if(sums[i]==value1){
                System.out.println(value1+" "+(i+2));
                break;
            }
        }
    }
}