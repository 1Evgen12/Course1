package timus.unsolved.task_1100;

import java.util.*;

public class TableOfResults {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        ArrayList <Integer[]>table = new ArrayList<Integer[]>();
        for (int i = 0; i < N; i++) {
                Integer team [] = new Integer[2];
                team[0] = in.nextInt();
                team[1] = in.nextInt();
                table.add(team);
        }

        //Collections.s;

//        table.sort(new Comparator<Integer[]>() {
//            @Override
//            public int compare(Integer[] o1, Integer[] o2) {
//                return o2[1]-o1[1];
//            }
//        });

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(table.get(i)[j]+" ");
            }
            System.out.println();
        }
    }
}
