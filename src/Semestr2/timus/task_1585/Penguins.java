package Semestr2.timus.task_1585;

import java.io.*;

public class Penguins {
    public static void main(String[] args) throws IOException {
        String inputFileName =
                "C:\\Users\\Evgeniy\\IdeaProjects\\" +
                        "Course1\\src\\Semestr2\\timus\\task_1585\\inputFile.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        int n = Integer.parseInt(bufferedReader.readLine());

        int [] penguins = new int[3];
        for (int i = 0; i < n; i++) {
            String name = bufferedReader.readLine();
            if(name.equals("Emperor Penguin"))
                penguins[0]++;
            else if(name.equals("Macaroni Penguin"))
                penguins[1]++;
            else
                penguins[2]++;
        }

        if(penguins[0]>penguins[1] && penguins[0]>penguins[2])
            System.out.println("Emperor Penguin");
        else if(penguins[1]>penguins[0] && penguins[1]>penguins[2])
            System.out.println("Macaroni Penguin");
        else
            System.out.println("Little Penguin");
    }
}
