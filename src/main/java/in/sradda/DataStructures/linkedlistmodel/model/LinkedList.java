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



    public boolean insertAtPosition(int val, int pos){
        LinkedListNode node = new LinkedListNode(val);
        int count1=1;
        LinkedListNode temp=head;
        while(temp!=null){
            count1=count1+1;
            if((count1)==pos){
                LinkedListNode temp1 = temp.getNext();
                temp.setNext(node);
                LinkedListNode temp2=temp.getNext();
                temp2.setNext(temp1);
                break;
            }
            temp=temp.getNext();
        }
        return true;
    }



    public boolean deleteAtPosition(int pos){
        LinkedListNode temp = head;
        int count1=0;
        while(temp!=null){
            count1=count1+1;
            if((count1+1)==pos){
                LinkedListNode temp1 = temp;
                LinkedListNode temp2 = temp.getNext().getNext();
                temp1.setNext(temp2);
            }
            temp=temp.getNext();
        }
        return true;
    }



    public boolean nodeExistence(int val){
        LinkedListNode temp = head;
        while(temp!=null){
            if(temp.getValue()==val){
                System.out.println("Given value is present in tha Linked List "+val);
                return true;
            }
            else{
                temp=temp.getNext();
            }
        }
        System.out.println("Value is not present");
        return false;
    }



    public int listSize(){
        int lsize=0;
        LinkedListNode temp = head;
        while(temp!=null){
            lsize=lsize+1;
            temp=temp.getNext();
        }
        return lsize;
    }



    public void printReverse(){
        LinkedListNode temp = head;
        reverseOrder(head);
    }
    public void reverseOrder(LinkedListNode head){
        LinkedListNode temp = head;
        if(temp==null){
            return;
        }
        reverseOrder(temp.getNext());
        System.out.println(temp.getValue() + " ");
    }


    public void reversingList(){
        LinkedListNode prev = null;
        LinkedListNode current = head;
        LinkedListNode next = null;
        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
        }
        head = prev;
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
