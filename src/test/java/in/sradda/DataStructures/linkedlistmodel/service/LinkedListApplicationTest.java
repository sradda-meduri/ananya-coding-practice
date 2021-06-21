package in.sradda.DataStructures.linkedlistmodel.service;

import com.sun.org.apache.xalan.internal.xsltc.dom.UnionIterator;
import in.sradda.DataStructures.linkedlistmodel.model.LinkedList;
import in.sradda.DataStructures.linkedlistmodel.model.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LinkedListApplicationTest {

    @Test
    public void testInput() {

        int[] arr = {1, 2, 3, 4, 5};
        LinkedList list = new LinkedList();
        for (int element : arr) {
            list.insertAtEnd(element);
        }
        LinkedList.Iterator iterator = list.iterator();
        Assertions.assertEquals(iterator.hasNext(), true);
        Assertions.assertEquals(iterator.next(), 1);
        Assertions.assertEquals(iterator.next(), 2);
        Assertions.assertEquals(iterator.next(), 3);
        Assertions.assertEquals(iterator.next(), 4);
        Assertions.assertEquals(iterator.next(), 5);
        Assertions.assertEquals(iterator.hasNext(), false);
        Assertions.assertEquals(list.deleteFront(),true);
        Assertions.assertEquals(list.deleteEnd(),true);
        list.insertAtBeginning(100);
    }

    @Test
    public void testCaseInputAtBeginning(){
        int arr[] = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtBeginning(element);
        }
        LinkedList.Iterator iterator = list.iterator();

        Assertions.assertEquals(iterator.hasNext(),true);
        Assertions.assertEquals(iterator.next(),5);
        Assertions.assertEquals(iterator.next(),4);
        Assertions.assertEquals(iterator.next(),3);
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(iterator.next(),1);
        Assertions.assertEquals(iterator.hasNext(),false);
    }

    @Test
    public void testCaseDelete(){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        list.deleteFront();
        LinkedList.Iterator iterator = list.iterator();
        Assertions.assertEquals(iterator.next(),2);
        Assertions.assertEquals(list.deleteEnd(),true);
    }

    @Test
    public void testCaseInsertAtPosition(){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        LinkedList.Iterator iterator = list.iterator();
        list.insertAtPosition(100,2);
        Assertions.assertEquals(iterator.next(), 1);
        Assertions.assertEquals(iterator.next(),100);
        Assertions.assertEquals(iterator.next(), 2);
        Assertions.assertEquals(iterator.next(), 3);
        Assertions.assertEquals(iterator.next(), 4);
        Assertions.assertEquals(iterator.next(), 5);
    }

    @Test
    public void testCaseDeleteAtPosition(){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        list.deleteAtPosition(2);
        LinkedList.Iterator iterator = list.iterator();
        Assertions.assertEquals(iterator.next(), 1);
        Assertions.assertEquals(iterator.next(), 3);
        Assertions.assertEquals(iterator.next(), 4);
        Assertions.assertEquals(iterator.next(), 5);
    }

    @Test
    public void testCaseNodeExistence(){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        Assertions.assertEquals(list.nodeExistence(10),false);
    }

    @Test
    public void testCaseSizeOfList(){
        int[] arr = {1,2,3,4,5};
        LinkedList list = new LinkedList();
        for(int element : arr){
            list.insertAtEnd(element);
        }
        Assertions.assertEquals(list.listSize(),5);
    }

    @Test
    public void testCaseReverseList() {

        int[] arr = {1, 2, 3, 4, 5};
        LinkedList list = new LinkedList();
        for (int element : arr) {
            list.insertAtEnd(element);
        }
        list.reversingList();
        LinkedList.Iterator iterator = list.iterator();
        Assertions.assertEquals(iterator.hasNext(), true);
        Assertions.assertEquals(iterator.next(), 5);
        Assertions.assertEquals(iterator.next(), 4);
        Assertions.assertEquals(iterator.next(), 3);
        Assertions.assertEquals(iterator.next(), 2);
        Assertions.assertEquals(iterator.next(), 1);

    }


}