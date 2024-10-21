package LinkedList;

public class MyLinkedList {

    Node head;
    MyLinkedList(Node node){
        this.head=node;

    }

    public boolean isEmpty(){
        if(this.head==null){
            return true;
        }
        return false;
    }
}
