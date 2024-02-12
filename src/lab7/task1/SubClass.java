package lab7.task1;

public class SubClass extends SuperClass{
    private String str2;

    SubClass (String str){
        super(str);
    }
    SubClass (String str1, String str2){
        super(str1);
        this.str2=str2;
    }

    @Override
    public String toString (){
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName()+'\n' +
                " str 1 = " + this.getStr1() + '\n' +
                " str 2 = " + this.str2 + '\n';
        return ClassNameAndFieldValue;

    }
    public String getStr2(){
        return str2;
    }
    public void setStr2(String str){
        str2 = str;
    }
}
