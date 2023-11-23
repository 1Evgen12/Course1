package lab6;

class SubArr{
    static int[] getArr (int  arr[], int c){

        if(c > arr.length){
            c = arr.length;
        }
        int subArr [] = new int [c];

        for (int i = 0; i < c; i++) {
            subArr[i] = arr[i];
        }
        return subArr;
    }
}
public class task6 {
    public static void main(String[] args) {
        int arr [] = {4,2,3,5,7,78,56,4,3,2,7};
        int res[] = SubArr.getArr(arr, 100);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
