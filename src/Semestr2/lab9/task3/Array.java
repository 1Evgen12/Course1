package Semestr2.lab9.task3;

import java.util.Scanner;

public class Array {
    public static void InpArr(int []arr, int index){
        Scanner scanner = new Scanner(System.in);
        if(index < arr.length){
            arr[index] = scanner.nextInt();
            index++;
            InpArr(arr,index);
        }
    }
    public static void OutArr(int []arr, int index){
        if(index<arr.length){
            System.out.println(arr[index]);
            index++;
            OutArr(arr,index);
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int arr [] = new int[scanner.nextInt()];
        InpArr(arr,0);
        OutArr(arr,0);}}
