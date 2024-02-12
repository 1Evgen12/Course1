package lab7.task3;

public class SubClass2 extends SubClass1{
    public String str;

    SubClass2 (int num, char ch, String str){
        super(num, ch);
        this.str = str;
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() +
                        "\n num = " + num+
                        "\n ch = " + ch+
                        "\n str = " + str;
        return superClassNameAndFieldValue;
    }

    public void setFields(int num, char ch, String str) {
        super.setFields(num, ch);
        this.str = str;
    }

}
