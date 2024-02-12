package lab7.task3;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(100);
        System.out.println(superClass.toString()+'\n');

        SubClass1 subClass1 = new SubClass1(200, 'A');
        System.out.println(subClass1.toString()+'\n');

        SubClass2 subClass2 = new SubClass2(300, 'B', "string");
        System.out.println(subClass2.toString()+'\n');



    }
}
