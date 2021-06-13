package in.sradda.DataStructures.linkedlistmodel.service;

import in.sradda.DataStructures.linkedlistmodel.model.LinkedList;
 import java.util.*;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int element : arr){
            list.insertAtEnd(element);
        }
        list.insertAtBeginning(0);
        System.out.println(list.deleteFront());
        System.out.println(list.deleteEnd());
        list.print();
    }
}
