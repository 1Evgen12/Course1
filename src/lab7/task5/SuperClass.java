package lab7.task5;

public class SuperClass {
    private String text;

    SuperClass(String text){
        this.text = text;
    }
    SuperClass(){
    };
    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue =
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                " text = " + text;
        return superClassNameAndFieldValue;
    }

    public void setText(String text) {
        this.text = text;}
    public String getText() {
        return text;}
}

