package lab6;

class SymToCode {

    static int [] getCode (char arr []){
        int codes [] = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            codes[i] = arr[i];
        }
        return codes;
    }
}
public class task7 {
    public static void main(String[] args) {
        int [] res = SymToCode.getCode(new char[]{
                'a', 'b', 'f', 'b', 'b', 'z', 'v', 'm', 'y', 'r', '1','2','3'});

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
    }
}
