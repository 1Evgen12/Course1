package lab7.task2;

public class SuperClass {
    private String str;

    SuperClass (String str){
        this.str = str;
    }
    SuperClass (){
        str = "str";
    }

    @Override
    public String toString (){
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName()+'\n' +
                " str = " + this.getStr() + '\n' ;
        return ClassNameAndFieldValue;
    }

    void setStr1 (String str){
        this.str = str;
    }
    void setStr1 (){
        str = "";
    }
    int getLength (){
        return str.length();
    }
    String getStr (){
        return str;
    }


}
