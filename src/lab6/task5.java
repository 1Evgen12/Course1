package lab6;

class SumSqrs {
    static int res;
    static int calcSum (int n){
        for (int i = 1; i <= n; i++) {
            res += Math.pow(i,2);
        }
        return res;
    }
}

public class task5 {
    public static void main(String[] args) {
        int res = SumSqrs.calcSum(5);
        System.out.println(res);
    }
}
