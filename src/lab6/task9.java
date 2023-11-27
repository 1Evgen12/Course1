package lab6;

class Reverse {

    static char [] reverse (char arr []){

        for (int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

}
public class task9 {
    public static void main(String[] args) {
        char [] arr = {'1', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', '0'};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        char [] res = Reverse.reverse(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
    }
}