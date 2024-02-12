package lab7.task5;

public class SubClass2 extends SuperClass {
    private char ch;

    SubClass2(){
        ch = '-';
    }
    SubClass2(char ch){
        this.ch = ch;
    }
    SubClass2(String text, char ch){
        super(text);
        this.ch=ch;
    }

    @Override
    public String toString(){
        String subClassNameAndFieldValue;
        subClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() +
                        "\n text = " + getText()+
                        "\n ch = " + ch;

        return subClassNameAndFieldValue;
    }

    public void setCh(String text, char ch) {
        setText(text);
        this.ch = ch;
    }

}
