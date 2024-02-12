package lab7.task4;

public class SubClass2 extends SubClass1 {
    public int num;

    SubClass2(){
        num = 0;
    }
    SubClass2(char ch){
        super(ch);
        num=0;
    }
    SubClass2(String str){
        super(str);
        num=0;
    }
    SubClass2(int num){
        this.num=num;
    }
    SubClass2(char ch, String str ){
        super(ch, str);
        num = 0;
    }
    SubClass2(char ch, int num ){
        super(ch);
        this.num = num;
    }
    SubClass2(String str, int num ){
        super(str);
        this.num = num;
    }
    SubClass2(char ch, String str, int num ){
        super(ch, str);
        this.num = num;
    }
    SubClass2(SubClass2 other){
        this.ch = other.ch;
        this.str = other.str;
        this.num = other.num;
    }
    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() +
                        "\n ch = " + ch+
                        "\n str = " + str+
                        "\n num = " + num;

        return superClassNameAndFieldValue;
    }

    public void setFields(char ch, String str, int num) {
        super.setFields(ch, str);
        this.num = num;
    }

}
