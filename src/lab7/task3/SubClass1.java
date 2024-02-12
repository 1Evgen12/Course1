package lab7.task3;

public class SubClass1 extends SuperClass {
    public char ch;

    SubClass1(){};
    SubClass1(int num, char ch){
        super(num);
        this.ch = ch;
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() +
                        "\n num = " + num+
        "\n ch = " + ch;
        return superClassNameAndFieldValue;
    }

    public void setFields(int num, char ch){
        super.setFields(num);
        this.ch = ch;
    }


}
