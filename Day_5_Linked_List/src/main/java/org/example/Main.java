package org.example;

import org.example.linked_list.Add_Element_in_Linked_List;
import org.example.linked_list.ReverseLinkedList;

public class Main {
    public static void main(String[] args) {

    // Add Element in Linked List
    //Add_Element_in_Linked_List list=new Add_Element_in_Linked_List();
   // list.createNewElementInLinkedList();

    // Traverse Element in linked List
    //list.printElementInLinkedList(list);

    // Reverse Element in linked List
        ReverseLinkedList rev=new ReverseLinkedList();
        rev.createLinkedList();
        rev.printLinkedList();
        rev.printReverseList();
        rev.printLinkedList();
    }
}