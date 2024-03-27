package Semestr2.lab9.compare.c5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<>();
        for (int i = 0; i < 14000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        list.remove(7000000);
        long end = System.currentTimeMillis();
        System.out.println("ArrayListRemove Mid time = " + (end - start));

        Set <Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < 14000000; i++) {
            set.add(i);
        }
        start = System.currentTimeMillis();
        set.remove(7000000);
        end = System.currentTimeMillis();

        System.out.println("LinkedHashSetRemove Mid time = " + (end - start));
        Map <Integer, Integer> map = new LinkedHashMap();
        for (int i = 0; i < 14000000; i++) {
            map.put(i, i);
        }
        start = System.currentTimeMillis();
        map.remove(7000000);
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMapRemove Mid time = " + (end - start));}}
