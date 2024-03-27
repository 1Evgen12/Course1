package Semestr2.lab9.task2;

import java.util.Scanner;

public class DecToBin_Recursion {

    public static String ToBin(long n){
        String result;
        if (n<=1)
            return String.valueOf(n);
        else
        {
            result = ToBin(n/2)+String.valueOf(n%2);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в десятичной cистеме счисления: ");
        long num = scanner.nextLong();
        System.out.println(num + " = "+ToBin(num));}}
