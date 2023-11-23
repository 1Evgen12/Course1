package lab6;

import java.util.Arrays;

class Myclass3{
    static int min;
    static int max;
    static double average;

    static public void setVals (int [] arr){
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\b]");
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length-1];
        average = (double) Arrays.stream(arr).sum() /arr.length;
    }
    static public void setVals2 (int ... args){
        System.out.print('[');
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println("\b]");
        Arrays.sort(args);
        min = args[0];
        max = args[args.length-1];
        average = (double)Arrays.stream(args).sum() /args.length;
    }
    static void print (){
        System.out.println("min = " + min + ", max = " + max + ", average = " + average + ';');
    }
}
public class task3 {
    public static void main(String[] args) {
        int [] arr = {3,7,5,1,8,6,4,8,34,658,0};
        Myclass3.setVals(arr);
        Myclass3.print();
        Myclass3.setVals2(5,6,7,1,3,67);
        Myclass3.print();
    }
}
