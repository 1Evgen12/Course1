package Semestr2.lab9.task6;

import java.util.HashMap;
import java.util.Map;
public class MyMap {
    public static void main(String[] args) {
        Map<Integer, String > hashmap = new HashMap<>();
        hashmap.put(1, "one");hashmap.put(2, "two");hashmap.put(3, "three");
        hashmap.put(4, "four");hashmap.put(5, "five");hashmap.put(6, "six");
        hashmap.put(7, "seven");hashmap.put(8, "eight");hashmap.put(9, "nine");hashmap.put(10, "ten");

        System.out.println("Строки у которых ключ > 5: ");
        for (Map.Entry<Integer, String> item: hashmap.entrySet()) {
            if(item.getKey()>5)
                System.out.println(item.getValue());
        }
        System.out.println();
        for (Map.Entry<Integer, String> item: hashmap.entrySet()) {
            if(item.getKey()==0){
                System.out.println("Key = 0");
                System.out.println(hashmap.values());}
        }
        System.out.println();
        int multiplying=1;
        for (Map.Entry<Integer, String> item: hashmap.entrySet()) {
            if(item.getValue().length()>5){
                multiplying*=item.getKey();}}
        System.out.println("multiplying = " + multiplying);}}
