package Semestr2.lab9.task7;

import java.util.ArrayList;

public class Circle_ArrayList {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            persons.add(new Person());
        }
        long start = System.currentTimeMillis();

        Boolean b = false;
        while(persons.size()!=1){
            for (int i = 0; i < persons.size(); i++) {
                if(b == true){
                    persons.remove(i);
                    i--;
                }
                b = !b;
            }
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("time = " + time);}}
