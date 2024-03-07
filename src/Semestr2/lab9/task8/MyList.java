package Semestr2.lab9.task8;

public class MyList {
    private Node head;
    private int size;

    MyList(){
        head=null;
        size=0;
    }

    public void AddFirst(int value){

        if(size==0)
            head=new Node(value, null);
        else{
            head = new Node(value, head);
        }
        size++;
    }
    public void AddLast(int value){

        if(size==0)
            head=new Node(value, null);
        else{

            Node newTail = new Node(value, null);
            Node ref = head;

            while(ref.next!= null){
                ref = ref.next;
            }
            ref.next = newTail;
        }
        size++;
    }

    public void Insert(int value, int index){

        if(size == 0){
            AddFirst(value);
        }else {
            Node newNode = new Node(value, null);
            Node ref = head;
            int k = 1;
            while (ref.next!=null&&(k<index)){
                ref=ref.next;
                k++;
            }
            newNode.next = ref.next;
            ref.next = newNode;
            size++;
        }
    }
    public void RemoveFirst(){

        if(size>1){
            head = head.next;
            size--;
        }else{
            head = null;
            size = 0;
        }
    }
    public void RemoveLast(){

        if(size>1){
            Node ref = head;
            int k = 1;
            while (k<size-1){
                ref=ref.next;
                k++;
            }
            ref.next = null;
            size--;
        }
        else{
            head = null;
            size = 0;
        }
    }
    public void RemoveAt(int index){

        if(size==1) {
            RemoveLast();
        }else if(index == size-1){
            RemoveLast();
        }else if(index == 0){
            RemoveFirst();
        }
        else{
            Node ref = head;
            int k = 1;
            while (ref.next!=null&&(k<index)){
                ref=ref.next;
                k++;
            }
            ref.next = ref.next.next;
            size--;
        }
    }public void RemoveAll( ){
        head = null;
        size=0;
    }

    public int element(){
        return head.value;
    }

    @Override
    public String toString(){
        Node ref =head;
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += String.valueOf(ref.value)+", ";
            ref = ref.next;
        }
        str = str.substring(0, str.length()-2)+"]";
        return str;
    }

    public int size(){
        return size;
    }

}

