package lab5;

import java.lang.Math;
import java.math.BigDecimal;

class MyClass {
    char sym;
    int num;
    MyClass (){
        sym = '-';
        num = 0;
    }
    MyClass (int num, char sym){
        this.num = num;
        this.sym = sym;
    }
    MyClass (double n){
        num = (int)n;
        sym = (char)num;
        double t = (n*100)%100;
        num = (int)(t);
        if(num % 10 == 0)num/= 10;
    }
    void printVars(){
        System.out.println("sym \'" + sym + "\'(" + (int)sym + ")");
        System.out.println("num " + num);}
}
public class task4 {
    public static void main(String[] args) {
        MyClass class1 = new MyClass( 65.1267);
        class1.printVars();}
}
