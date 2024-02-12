package lab7.task3;

public class SuperClass {
    public int num;

    SuperClass (int num){
        this.num = num;
    }
    SuperClass(){};

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                " num = " + num;
        return superClassNameAndFieldValue;
    }


    public void setFields(int num) {
        this.num = num;
    }
}

