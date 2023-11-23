package lab5;
class MyClass3{
    private int min;
    private int max;

    MyClass3() {
        min=0;
        max=0;}
    MyClass3 (int value){
            min = value;
            max = value;
    }
    MyClass3 (int value1, int value2){
        if(value1 > value2){
            int temp = value1;
            value1 = value2;
            value2 = temp;}
            min = value1;
            max = value2;
    }
    void setVal (int value){
        if(value < min)
            min = value;
        if(value > max)
            max = value;
    }
    void setVal (int value1, int value2){
        if(value1 > value2){
            int temp = value1;
            value1 = value2;
            value2 = temp;}
        if(value1 < min)
            min = value1;
        if(value2 > max)
            max = value2;
    }
    void printVars(){
        System.out.println("min = " + min + ", max = " + max + ";");}
}
public class task6 {
    public static void main(String[] args) {
        MyClass3 class1 = new MyClass3(30, 45);
        class1.printVars();
        class1.setVal(50);
        class1.printVars();
        class1.setVal(15, 100);
        class1.printVars();}
}
