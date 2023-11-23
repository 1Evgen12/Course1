package lab5;

class Symbols {
    private char a;
    private char b;

    Symbols(){
        a = 'a';
        b = 'b';
    }
    public void setA (char a){
        this.a = a;
    }
    public void setB (char b){
        this.b = b;
    }

    public boolean printSymbols (){

        boolean result = false;

        for (int i = a; i <= b ; i++) {
            if(a <= b)
                result = true;
            System.out.print((char)i + ", ");
        }
        System.out.println("\b\b");

        return result;
    }
}
public class task2 {
    public static void main(String[] args) {
        Symbols symbols = new Symbols();
        symbols.printSymbols();}}
