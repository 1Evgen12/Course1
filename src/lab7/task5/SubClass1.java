package lab7.task5;

public class SubClass1 extends SuperClass {
    private int num;

    SubClass1(){};
    SubClass1(int num){
        this.num = num;
    };
    SubClass1(String text, int num){
        super(text);
        this.num = num;
    };

    @Override
    public String toString(){
        String subClassNameAndFieldValue;
        subClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() +
                        "\n text = " + getText()+
                        "\n num = " + num;

        return subClassNameAndFieldValue;
    }

    public void setNum(String text, int num){
        setText(text);
        this.num = num;
    }


}
