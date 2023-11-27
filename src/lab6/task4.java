package lab6;

class Factorial{
    static int result=1;
    static int dblFactorial (int n){
        if(n < 2)
            return 1;
        return (dblFactorial(n-2)*n);
    }
}

public class task4 {
    public static void main(String[] args) {
        int res = Factorial.dblFactorial(10);
        System.out.println(res);
    }
}
