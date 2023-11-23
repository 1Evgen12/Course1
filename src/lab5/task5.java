package lab5;

class MyClass2{
    private int num;

    MyClass2 (){
        num = 0;
    }
    MyClass2 (int number){
        num = number;
        if(num > 100)
            num = 100;
    }
    void setValue (){
        num = 0;
    }
    void setValue (int number){
        num = number;
        if(num > 100)
            num = 100;
    }
    int getValue (){
        return num;
    }
    void printValue (){
        System.out.println(num);}
}
public class task5 {
    public static void main(String[] args) {
        MyClass2 a = new MyClass2(456);
        a.printValue();
        a.setValue();
        a.printValue();}
}
