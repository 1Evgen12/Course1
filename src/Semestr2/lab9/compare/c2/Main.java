package Semestr2.lab9.compare.c2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<>();

        for (int i = 1; i <= 14000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        list.add(7000000,0);
        long end = System.currentTimeMillis();
        System.out.println("ArrayListAddBegin time = " + (end - start));

        Set <Integer> set = new LinkedHashSet<>();
        for (int i = 1; i <= 14000000; i++) {
            set.add(i);
        }
        start = System.currentTimeMillis();
        set.add(0);
        end = System.currentTimeMillis();
        System.out.println("LinkedHashSetAddBegin time = " + (end - start));
        Map <Integer, Integer> map = new LinkedHashMap();
        for (int i = 1; i <= 14000000; i++) {
            map.put(i, i);
        }
        start = System.currentTimeMillis();
        map.put(0, 0);
        end = System.currentTimeMillis();

        System.out.println("LinkedHashMapAddBegin time = " + (end - start));
    }
}
