package lab7.task4;

public class SubClass1 extends SuperClass {
    public String str;

    SubClass1(){};
    SubClass1(char ch){
        super(ch);
    };
    SubClass1(String str){
        this.str = str;
    };
    SubClass1(char ch, String str){
        super(ch);
        this.str = str;
    }
    SubClass1(SubClass1 other){
        this.ch = other.ch;
        this.str = other.str;
    }
    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() +
                        "\n ch = " + ch+
                        "\n str = " + str;

        return superClassNameAndFieldValue;
    }

    public void setFields(char ch, String str){
        super.setFields(ch);
        this.str = str;
    }


}
