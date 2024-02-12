package lab7.task4;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass('S');
        System.out.println(superClass.toString()+'\n');

        SuperClass superClass2 = new SuperClass(superClass);
        System.out.println(superClass.toString()+'\n');

        SubClass1 subClass1 = new SubClass1("str1");
        System.out.println(subClass1.toString()+'\n');

        SubClass2 subClass2 = new SubClass2('c', "dtr", 1);
        System.out.println(subClass2.toString()+'\n');







    }
}
