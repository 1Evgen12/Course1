package Semestr2.lab10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) {
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("C:/Users/Evgeniy/IdeaProjects/Course1/src/Semestr2/lab10/JSON/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o: jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
