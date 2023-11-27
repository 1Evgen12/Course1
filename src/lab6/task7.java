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

        char [] arr = {'1', 'a', 'b', 'f', 'b', 'b', 'z', 'v', 'm', 'y', 'r', '0'};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int [] res = SymToCode.getCode(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
    }
}
