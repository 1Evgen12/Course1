package timus.unsolved.task_1001;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextDouble()){
            double num = in.nextDouble();
            double res = Math.sqrt(num);
            System.out.println(res);

        }
    }
}
//List<BigDecimal> a = new ArrayList<>();
//
//        while(in.hasNextBigDecimal()){
//            BigDecimal num = in.nextBigDecimal();
//            BigDecimal res = num.sqrt(MathContext.DECIMAL64);
//            res = res.setScale(4, RoundingMode.HALF_UP);
//            a.add(res);
//        }
//
//        for (int i = a.size()-1; i >=0; i--) {
//            System.out.println(a.get(i));
//        }