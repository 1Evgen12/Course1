package lab7.task2;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("abc");
        int length = superClass.getLength();
        System.out.println(superClass.toString()+" length = "+length+'\n');

        SubClass subClass = new SubClass("STR", 435);
        System.out.println(subClass.toString());
        subClass.setStr1("qwe", 123);
        System.out.println(subClass.toString());


    }
}
