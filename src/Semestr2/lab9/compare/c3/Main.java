package Semestr2.lab9.compare.c3;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<>();
        for (int i = 1; i <= 14000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        list.add(14000000,0);
        long end = System.currentTimeMillis();
        System.out.println("ArrayListAdd End time = " + (end - start));

        Set <Integer> set = new LinkedHashSet<>();
        for (int i = 1; i <= 14000000; i++) {
            set.add(i);
        }
        start = System.currentTimeMillis();
        set.add(0);
        end = System.currentTimeMillis();
        System.out.println("LinkedHashSetAdd End time = " + (end - start));
        Map <Integer, Integer> map = new LinkedHashMap();
        for (int i = 1; i <= 14000000; i++) {
            map.put(i, i);
        }
        start = System.currentTimeMillis();
        map.put(0, 0);
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMapAdd End time = " + (end - start));}}
