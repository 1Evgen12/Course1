package lab5;
class Symbol {
    private char symbol;
    public void setSymbol (char symbol){
        this.symbol = symbol;
    }
    public int getCode (){
        return symbol;
    }
    public void printSym (){
        System.out.println("символ " + symbol + " (код " + (int)symbol + ")");
    }
}

public class task1 {
    public static void main(String[] args) {

        Symbol sym = new Symbol();
        sym.setSymbol('a');
        sym.printSym();
        int Int = sym.getCode();
        System.out.println(Int);
    }
}
