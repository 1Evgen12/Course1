package lab8.task3;

import java.io.*;

public class WriteWords {

    public static void main(String[] args) {
        String path = "C:\\Users\\Evgeniy\\IdeaProjects\\semestr1\\src\\lab8\\task3\\";
        File file = new File(path + "poem.txt");
        File file2 = new File(path + "words.txt");

        char vowels [] = {'а','е','ё','и', 'о','у','ы','э','ю','я'};
        try {
            file2.createNewFile();
            BufferedReader rd = new BufferedReader(new FileReader(file));
            PrintWriter wr = new PrintWriter(new FileWriter(file2));

            String str;
            String [] words=null;
            int line = 1;
            while ((str = rd.readLine())!= null){
                int count = 0;
                if(str.length()==0){
                    continue;
                }
                words = str.split(" ");
                words[0]= words[0].toLowerCase();

                wr.write(line+". ");

                for (int i = 0; i < words.length; i++) {
                     link:{
                    //проверка на согласную первую букву
                     for (int j = 0; j < vowels.length; j++) {
                        if(vowels[j] == words[i].charAt(0)){
                            break link;
                        }
                     }
                     if(words[i].contains("...")){
                             words[i] = words[i].substring(0, words[i].length()-3);
                         }
                     else if(words[i].contains("!")|words[i].contains(",")|words[i].contains(";")|words[i].contains("?")
                     |words[i].contains(":")|words[i].contains(".")){
                         words[i] = words[i].substring(0, words[i].length()-1);
                     }
                     else if (words[i].contains("—")){
                         continue ;
                     }
                         wr.write(words[i]+" ");
                     count++;}
                }
                    wr.write("["+count+"]");
                 wr.println();
                 line++;
            }
            rd.close();
            wr.flush();
            wr.close();

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
