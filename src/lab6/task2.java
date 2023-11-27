package lab6;

class Myclass2 {
    static private int num = 0;

    static void printVal (){
        System.out.println(num++);
    }
}

public class task2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Myclass2.printVal();

        }
    }
}
