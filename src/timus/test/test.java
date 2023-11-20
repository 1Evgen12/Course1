package timus.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N == 0){
            System.out.println(-1);
            return;
        }
        else if (N == 1){
            System.out.println(11);
            return;
        }
        List<Integer> array = new ArrayList<>();

        for (int i = 1; i <= N/2; i++) {
            if(N % i == 0) {
                array.add(i);
                if(i*i == N) {
                    array.add(i);
                    //System.out.print(i + " ");
                }
                //System.out.print(i + " ");
            }
        }
        array.add(N);
        //System.out.print(N);

        int size = array.size();
        int array2 [] = new int [size];
        int index = 0;
        for (int i = 0; i < size/2; i++) {
            int a = array.get(0);
            int b = array.get(array.size()-1);

            String str1 = String.valueOf(a) + String.valueOf(b);
            String str2 = String.valueOf(b) + String.valueOf(a);

            a = Integer.parseInt(str1);
            b = Integer.parseInt(str2);
            array2[index++] = a;
            array2[index++] = b;
            array.remove(0);
            array.remove(array.size()-1);
        }

        //System.out.print('\n');
        System.out.println(Arrays.stream(array2).min().hashCode());

    }
}

