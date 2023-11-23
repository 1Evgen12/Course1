package lab6;

import java.util.Arrays;

class Average {
    static double average;
    static double calculate (int arr []){
        average = (double) (Arrays.stream(arr).sum()) /arr.length;
        return average;
    }
}

public class task8 {
    public static void main(String[] args) {
        double res = Average.calculate(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println(res);
    }
}