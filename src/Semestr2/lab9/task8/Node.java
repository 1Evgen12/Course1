package Semestr2.lab9.task8;

public class Node {
    public int value;
    public Node next;

    Node(int value, Node next){
        this.value = value;
        this.next=next;
    }
    Node(){
        this.value = 0;
        this.next=null;
    }
}

