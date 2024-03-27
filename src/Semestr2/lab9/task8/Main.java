package Semestr2.lab9.task8;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyList list = new MyList();
        //list.AddLast(1);
        list.Insert(1, 0);
        list.Insert(2, 1);
        list.AddLast(3);
        list.AddLast(4);


        System.out.println(list.toString());

        LinkedList<Integer> list2 = new LinkedList<>();
    }
}
