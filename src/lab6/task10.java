package lab6;

class MinMax{
    static int[] getMinMax (int ... args){
        int min = args[0];
        int max = args[0];
        for (int i = 1; i < args.length; i++) {
            if(args[i] < min)
                min = args[i];
            if(args[i] > max)
                max = args[i];
        }
        int pair [] = new int[2];
        pair[0] = min;
        pair[1] = max;
        return pair;
    }
}
public class task10 {
    public static void main(String[] args) {
        int pair [] = MinMax.getMinMax(4,2,3,5,7,78,56,4,3,2,9);
        for (int i = 0; i < 2; i++) {
            System.out.print(pair[i]+" ");
        }
    }
}