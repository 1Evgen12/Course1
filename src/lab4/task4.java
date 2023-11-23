package lab4;
public class task4 {
    public static void main(String[] args) {
        int h = 10;
        int w = h;

        char array [][] = new char[h][];
        for (int i = 0; i < h; i++) {
            array [i] = new char[w--];
        }

        for (int i = 0; i < h; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
            }
        }

        System.out.println();
        for (int i = 0; i < h; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }




//        for (int i = 1; i < h & i <= w; i++) {
//            int c = 0;
//            System.out.print(i + "\t ");
//            //System.out.print("номер строки: " + i + " ");
//            for (int j = 0; j < w & j < i; j++) {
//                System.out.print("*");
//                c++;
//            }
//            System.out.println();
//        }
    }
}
