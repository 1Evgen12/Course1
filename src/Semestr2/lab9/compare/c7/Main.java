package Semestr2.lab9.compare.c7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<>();
        for (int i = 0; i < 140000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        int temp = list.get(140000000-1);
        long end = System.currentTimeMillis();
        System.out.println("ArrayListIndex time = " + (end - start));

        Map<Integer, Integer> map = new LinkedHashMap();
        for (int i = 0; i < 140000000; i++) {
            map.put(i, i);
        }
        start = System.currentTimeMillis();
        map.get(140000000-1);
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMapIndex time = " + (end - start));}}