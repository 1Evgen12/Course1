package lab7.task5;

public class Main {
    public static void main(String[] args) {

        SuperClass superClass = new SuperClass("Text...");
        SubClass1 subClass1 = new SubClass1(1);
        SubClass2 subClass2 = new SubClass2('S');

        System.out.println(superClass.toString()+'\n');

        superClass = subClass1;
        System.out.println(superClass.toString()+'\n');

        superClass = subClass2;
        System.out.println(superClass.toString()+'\n');
    }
}
