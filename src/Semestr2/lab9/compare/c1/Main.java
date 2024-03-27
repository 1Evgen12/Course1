package Semestr2.lab9.compare.c1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<>();

        for (int i = 1; i <= 14000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        list.add(0,0);
        long end = System.currentTimeMillis();
        System.out.println("ArrayListAddBegin time = " + (end - start));
    }
}
