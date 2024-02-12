package lab7.task2;

public class SubClass extends SuperClass{
    public int number;

    SubClass (String str, int num){
        super(str);
        number = num;
    }

    @Override
    public String toString (){
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName()+'\n' +
                " str = " + this.getStr() + '\n' +
                " number = " + this.number + '\n';
        return ClassNameAndFieldValue;
    }

    @Override
    void setStr1() {
        super.setStr1();
        number = 0;
    }
    @Override
    void setStr1(String str) {
        super.setStr1(str);
        number = 0;
    }
    void setStr1(int num) {
        super.setStr1();
        number = num;
    }
    void setStr1(String str, int num) {
        super.setStr1(str);
        number = num;
    }
}
