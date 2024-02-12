package lab7.task1;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("str");
        String className1 = superClass.toString();
        System.out.println(className1);

        SubClass subClass = new SubClass("str1", "str2");
        String className2 = subClass.toString();
        System.out.println(className2);
    }
}
