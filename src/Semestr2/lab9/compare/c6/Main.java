package Semestr2.lab9.compare.c6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>list = new ArrayList<>();
        for (int i = 0; i < 14000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        list.remove(14000000-1);
        long end = System.currentTimeMillis();
        System.out.println("ArrayListRemove End time = " + (end - start));
}}
