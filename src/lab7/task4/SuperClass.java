package lab7.task4;

public class SuperClass {
    public char ch;

    SuperClass(char ch){
        this.ch = ch;
    }
    SuperClass(){
        this.ch = '-';
    };
    SuperClass(SuperClass other){
        this.ch = other.ch;
    }
    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                " ch = " + ch;
        return superClassNameAndFieldValue;
    }

    public void setFields(char ch) {
        this.ch = ch;
    }
}

