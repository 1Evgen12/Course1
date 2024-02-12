package lab7.task1;

public class SuperClass {
    private String str1;

    SuperClass (String str){
        this.str1 = str;
    }
    SuperClass(){};
    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name:" + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1(){
        return str1;
    }

    public void setStr1(String str) {
        this.str1 = str;
    }
}
