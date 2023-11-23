package lab6;

import java.util.Arrays;

class Myclass1 {
    char symbol;
    String string;

    void setVal (char s){
        symbol = s;
    }
    void setVal (String s){
        string = s;
    }
    void setVal (char arr []){
        if(arr.length == 1)
            symbol = arr[0];
        else if(arr.length > 1){
            string = Arrays.toString(arr);
        }
    }
    void printVal (){
        System.out.println(symbol);
        System.out.println(string);
    }
}

public class task1 {
    public static void main(String[] args) {
        Myclass1 class1 = new Myclass1();

        char arr [] = {'a','b','c','d'};
        char arr1 [] = {'a'};
        String str = "string";
        char sym = 'z';

        class1.setVal(arr);
        class1.setVal(sym);
        class1.printVal();
    }
}
