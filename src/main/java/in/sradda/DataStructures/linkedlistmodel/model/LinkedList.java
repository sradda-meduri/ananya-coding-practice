package in.sradda.DataStructures.linkedlistmodel.model;

public class LinkedList {
    private LinkedListNode head;

    public LinkedList() {
        this.head = null;
    }
     public void insertAtBeginning(int val){
        LinkedListNode node = new LinkedListNode(val);
        if(head == null){
            head = node;
        }
        else{
            LinkedListNode temp = null;
            temp = node;
            temp.setNext(head);
            head=temp;
        }
     }

     public boolean deleteFront(){
        if(head.getNext()==null){
            head = null;
        }
        else{
            LinkedListNode temp = head;
            head=temp.getNext();
            temp.setNullValue();
            return true;
        }
        return false;
     }

     public boolean deleteEnd(){
         if(head.getNext()==null){
             head = null;
         }
         else{
             LinkedListNode temp = head;
             while(temp.getNext().getNext() != null){
                 temp=temp.getNext();
             }
             temp.setNullValue();
             return true;
         }
        return false;
     }

    public void insertAtEnd(int val) {
        LinkedListNode node = new LinkedListNode(val);

        if (head == null) {
            head = node;
        } else {
            LinkedListNode temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }


    public void print() {
        System.out.print("head -> ");

        LinkedListNode ptr = head;

        while (ptr != null) {
            System.out.print(ptr.getValue() + " -> ");
            ptr = ptr.getNext();
        }

        System.out.println(" NULL ");

    }

    public Iterator iterator(){
        return new Iterator(head);
    }

    public class Iterator {
        private  LinkedListNode ptr ;

        public Iterator(LinkedListNode head){
            this.ptr = head;
        }

        public boolean hasNext(){
            return ptr != null;
        }

        public int next(){
            int result = ptr == null? -1 : ptr.getValue();
             ptr = ptr == null ? ptr:ptr.getNext();
             return result;
        }

        public int value(){
            int result = ptr.getValue();
            return result;
        }
    }
}
