package Semestr2.timus.task_1581;

import java.io.*;

public class TeamWork {
    public static void main(String[] args) throws IOException {
        String inputFileName =
                "C:\\Users\\Evgeniy\\IdeaProjects\\" +
                        "Course1\\src\\Semestr2\\timus\\task_1581\\inputFile.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        int N = Integer.parseInt(bufferedReader.readLine());
        String [] numbers = bufferedReader.readLine().split(" ");
        int count = 0, number=0;

        for (int i = 0; i < numbers.length; i++) {
            number = Integer.parseInt(numbers[i]);
            count++;
            if(i==numbers.length-1) {
                System.out.print(count + " " + number + " ");
                break;
            }
            if(Integer.parseInt(numbers[i+1])!=number){
                System.out.print(count+" "+number+" ");
                count=0;
            }
        }




    }
}
