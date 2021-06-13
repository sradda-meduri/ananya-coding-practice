package in.sradda.DataStructures.linkedlistmodel.model;

public class LinkedListNode {
    private int value;
    private LinkedListNode next;

    public LinkedListNode(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setNext(LinkedListNode node){
        this.next = node;
    }

    public void setNullValue(){
        this.next=null;
    }

    public LinkedListNode getNext(){
        return this.next;
    }
}
