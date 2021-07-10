package in.sradda.DataStructures.linkedlistmodel.service;

import in.sradda.DataStructures.linkedlistmodel.model.LinkedList;
import in.sradda.DataStructures.linkedlistmodel.model.LinkedListNode;

import java.util.*;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//
//        for(int element : arr) {
//            list.insertAtEnd(element);
//        }
//
//        System.out.println(list.insertAtPosition(100,20));
//        list.print();

        Integer one = 1;
        list.insertSorted(one);
        list.print();
        Integer three =3;
        list.insertSorted(three);
        list.print();
        Integer two = 2;
        list.insertSorted(two);
        list.print();
        Integer minus = -5;
        list.insertSorted(minus);
        list.print();

    }
}
